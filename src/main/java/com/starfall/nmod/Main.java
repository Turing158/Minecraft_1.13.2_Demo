package com.starfall.nmod;

import com.starfall.nmod.block.TestBlock;
import com.starfall.nmod.entity.EntityTool;
import com.starfall.nmod.entity.TestEntity;
import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.item.Test;
import com.starfall.nmod.item.tools.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import javax.annotation.Nullable;

//ͨ�� @Mod ע�ⴴ��һ��ģ��
//value��ģ�������
@Mod(Main.MOD_ID)
public class Main {


    //����һ��ȫ�ֱ��� MOD_ID
    public static final String MOD_ID = "nmod";

    //����һ�����캯��[ģ��,ֱ�ӳ�]
    public Main() {
        //����һ�� �¼�����
        //ͨ������¼�������ע���¼�
        //����¼�������ͨ�� FMLJavaModLoadingContext.get().getModEventBus() ��������
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        //ͨ������¼�������ע���¼�
        bus.addListener(this::setup);
        //����ע�����һ���¼�,����¼����ڿͻ��˼��ص�ʱ�򴥷����¼�
        bus.addListener(this::enqueueIMC);
        //����ע�����һ���¼�,����¼����ڿͻ��˼��ص�ʱ�򴥷����¼�
        bus.addListener(this::processIMC);
        //����ע�����һ���¼�,����¼����ڿͻ��˼��ص�ʱ�򴥷����¼�
        bus.addListener(this::doClientStuff);

        //ͨ������¼�������ע���¼�
        MinecraftForge.EVENT_BUS.register(this);
    }


    //����һ�� setup ����[ģ��,ֱ�ӳ�]
    //�����������ģ����ص�ʱ�򴥷��ķ���
    private void setup(FMLCommonSetupEvent event) {
        System.out.println("===========================\n����MOD\n===========================");
        System.out.println("===========================\nSetupMOD\n===========================");
    }

    //����һ�� doClientStuff ����[ģ��,ֱ�ӳ�]
    //����������ڿͻ��˼��ص�ʱ�򴥷��ķ���
    private void doClientStuff(FMLClientSetupEvent event) {
        System.out.println("===========================\ndoClientStuff����\n===========================");
    }

    //����һ�� enqueueIMC ����[ģ��,ֱ�ӳ�]
    //����������ڿͻ��˼��ص�ʱ�򴥷��ķ���
    private void enqueueIMC(InterModEnqueueEvent event) {
        System.out.println("===========================\nenqueueIMC����\n===========================");
    }

    //����һ�� processIMC ����[ģ��,ֱ�ӳ�]
    //����������ڿͻ��˼��ص�ʱ�򴥷��ķ���
    private void processIMC(InterModProcessEvent event) {
        System.out.println("===========================\nprocessIMC����\n===========================");
    }


    //����һ�� onServerStarting ����[ģ��,ֱ�ӳ�]
    //����������ڷ��������ص�ʱ�򴥷��ķ���
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        System.out.println("===========================\nonServerStarting����\n===========================");
    }


    //[ģ��,ֱ�ӳ�]
    //����һ����̬�ڲ��� RegistryEvents
    //�����������ע����Ʒ,����,ʵ��ȵ�
    //�������Ҫͨ�� @Mod.EventBusSubscriber ע����ע��
    //bus = Mod.EventBusSubscriber.Bus.MOD ����ǹ̶�д��
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        //���Ϊ�˷��㷽��ע�����Ʒ������Ʒ��
        public static TestBlock testBlock = new TestBlock();


        //����һ�� onBlocksRegistry ����[ģ��,ֱ�ӳ�]
        //�����������ע�᷽���ʱ�򴥷��ķ���
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegister) {
            IForgeRegistry<Block> registry = blockRegister.getRegistry();//[ģ��,ֱ�ӳ�]
            registry.register(testBlock);//ע�᷽��
        }



        //����һ�� onItemsRegistry ����[ģ��,ֱ�ӳ�]
        //�����������ע����Ʒ��ʱ�򴥷��ķ���
        @SubscribeEvent
        public static void onBItemRegistry(final RegistryEvent.Register<Item> itemRegister) {
            IForgeRegistry<Item> registry = itemRegister.getRegistry();//[ģ��,ֱ�ӳ�]
            registry.registerAll(new Test());//ע����Ʒ
            registry.registerAll(new TestSword(),new TestAxe(),new TestHoe(),new TestShovel(),new TestPickaxe());//ע�Ṥ��
            registry.registerAll(new ItemBlock(testBlock,new Item.Properties().group(TestItemGroup.TEST_BLOCK_GROUP)).setRegistryName(TestBlock.NAME));//ע�᷽��
        }

        //[δ���,��]
        @SubscribeEvent
        public static void registerRenderers(ModelRegistryEvent event) {
            RenderingRegistry.registerEntityRenderingHandler(EntityTool.class, manager -> new RenderLiving(manager, new TestEntity(), 0.5f) {
                @Nullable
                @Override
                protected ResourceLocation getEntityTexture(Entity entity) {

                    return new ResourceLocation("nmod","textures/entity/testentity.png");
                }
            });
        }
    }
}
