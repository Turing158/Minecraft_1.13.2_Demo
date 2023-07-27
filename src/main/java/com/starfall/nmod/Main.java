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

//通过 @Mod 注解创建一个模组
//value：模组的名称
@Mod(Main.MOD_ID)
public class Main {


    //创建一个全局变量 MOD_ID
    public static final String MOD_ID = "nmod";

    //创建一个构造函数[模板,直接抄]
    public Main() {
        //创建一个 事件总线
        //通过这个事件总线来注册事件
        //这个事件总线是通过 FMLJavaModLoadingContext.get().getModEventBus() 来创建的
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        //通过这个事件总线来注册事件
        bus.addListener(this::setup);
        //这里注册的是一个事件,这个事件是在客户端加载的时候触发的事件
        bus.addListener(this::enqueueIMC);
        //这里注册的是一个事件,这个事件是在客户端加载的时候触发的事件
        bus.addListener(this::processIMC);
        //这里注册的是一个事件,这个事件是在客户端加载的时候触发的事件
        bus.addListener(this::doClientStuff);

        //通过这个事件总线来注册事件
        MinecraftForge.EVENT_BUS.register(this);
    }


    //创建一个 setup 方法[模板,直接抄]
    //这个方法是在模组加载的时候触发的方法
    private void setup(FMLCommonSetupEvent event) {
        System.out.println("===========================\n建立MOD\n===========================");
        System.out.println("===========================\nSetupMOD\n===========================");
    }

    //创建一个 doClientStuff 方法[模板,直接抄]
    //这个方法是在客户端加载的时候触发的方法
    private void doClientStuff(FMLClientSetupEvent event) {
        System.out.println("===========================\ndoClientStuff方法\n===========================");
    }

    //创建一个 enqueueIMC 方法[模板,直接抄]
    //这个方法是在客户端加载的时候触发的方法
    private void enqueueIMC(InterModEnqueueEvent event) {
        System.out.println("===========================\nenqueueIMC方法\n===========================");
    }

    //创建一个 processIMC 方法[模板,直接抄]
    //这个方法是在客户端加载的时候触发的方法
    private void processIMC(InterModProcessEvent event) {
        System.out.println("===========================\nprocessIMC方法\n===========================");
    }


    //创建一个 onServerStarting 方法[模板,直接抄]
    //这个方法是在服务器加载的时候触发的方法
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        System.out.println("===========================\nonServerStarting方法\n===========================");
    }


    //[模板,直接抄]
    //创建一个静态内部类 RegistryEvents
    //这个类是用来注册物品,方块,实体等的
    //这个类需要通过 @Mod.EventBusSubscriber 注解来注册
    //bus = Mod.EventBusSubscriber.Bus.MOD 这个是固定写法
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        //这个为了方便方块注册成物品放入物品栏
        public static TestBlock testBlock = new TestBlock();


        //创建一个 onBlocksRegistry 方法[模板,直接抄]
        //这个方法是在注册方块的时候触发的方法
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegister) {
            IForgeRegistry<Block> registry = blockRegister.getRegistry();//[模板,直接抄]
            registry.register(testBlock);//注册方块
        }



        //创建一个 onItemsRegistry 方法[模板,直接抄]
        //这个方法是在注册物品的时候触发的方法
        @SubscribeEvent
        public static void onBItemRegistry(final RegistryEvent.Register<Item> itemRegister) {
            IForgeRegistry<Item> registry = itemRegister.getRegistry();//[模板,直接抄]
            registry.registerAll(new Test());//注册物品
            registry.registerAll(new TestSword(),new TestAxe(),new TestHoe(),new TestShovel(),new TestPickaxe());//注册工具
            registry.registerAll(new ItemBlock(testBlock,new Item.Properties().group(TestItemGroup.TEST_BLOCK_GROUP)).setRegistryName(TestBlock.NAME));//注册方块
        }

        //[未完成,勿抄]
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
