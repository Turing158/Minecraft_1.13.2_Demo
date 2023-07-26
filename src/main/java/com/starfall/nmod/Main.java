package com.starfall.nmod;

import com.starfall.nmod.block.TestBlock;
import com.starfall.nmod.entity.EntityTool;
import com.starfall.nmod.entity.TestEntity;
import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.item.Test;
import com.starfall.nmod.item.tools.*;
import com.sun.org.apache.xerces.internal.impl.dv.dtd.ENTITYDatatypeValidator;
import net.minecraft.block.Block;
import net.minecraft.client.particle.ParticleDragonBreath;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.data.FurnaceRecipeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tags.Tag;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.loot.properties.EntityProperty;
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
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.commons.lang3.text.translate.EntityArrays;

import javax.annotation.Nullable;
import javax.xml.stream.events.EntityReference;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "nmod";
    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::enqueueIMC);
        bus.addListener(this::processIMC);
        bus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event) {
        System.out.println("===========================\n建立MOD\n===========================");
    }

    private void doClientStuff(FMLClientSetupEvent event) {
        System.out.println("===========================\ndoClientStuff方法\n===========================");
    }

    private void enqueueIMC(InterModEnqueueEvent event) {
        System.out.println("===========================\nenqueueIMC方法\n===========================");
    }

    private void processIMC(InterModProcessEvent event) {
        System.out.println("===========================\nprocessIMC方法\n===========================");
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        System.out.println("===========================\nonServerStarting方法\n===========================");
    }
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        public static TestBlock testBlock = new TestBlock();
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegister) {
            IForgeRegistry<Block> registry = blockRegister.getRegistry();
            registry.register(testBlock);
        }
        @SubscribeEvent
        public static void onBItemRegistry(final RegistryEvent.Register<Item> itemRegister) {
            IForgeRegistry<Item> registry = itemRegister.getRegistry();
            registry.registerAll(new Test());
            registry.registerAll(new TestSword(),new TestAxe(),new TestHoe(),new TestShovel(),new TestPickaxe());
            registry.registerAll(new ItemBlock(testBlock,new Item.Properties().group(TestItemGroup.TEST_BLOCK_GROUP)).setRegistryName(TestBlock.NAME));
        }


        @SubscribeEvent
        public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> entityRegister) {
            IForgeRegistry<EntityType<?>> registry = entityRegister.getRegistry();
        }
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
