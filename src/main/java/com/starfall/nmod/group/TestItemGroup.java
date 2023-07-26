package com.starfall.nmod.group;

import com.starfall.nmod.block.TestBlock;
import com.starfall.nmod.item.tools.TestAxe;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class TestItemGroup extends ItemGroup {
    public static final ItemGroup TEST_ITEM_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testItemGroup") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.ARROW);
        }
    };
    public static final ItemGroup TEST_TOOL_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testToolGroup") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("nmod:testaxe")));
        }
    };
    public static final ItemGroup TEST_BLOCK_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testToolGroup") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.COAL);
        }
    };
    public TestItemGroup(int index, String label) {
        super(index, label);
    }
}
