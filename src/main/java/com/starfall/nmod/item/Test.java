package com.starfall.nmod.item;

import com.starfall.nmod.group.TestItemGroup;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
public class Test extends Item {
    public Test() {
        super(new Item.Properties()
                .maxStackSize(16)
                .group(TestItemGroup.TEST_ITEM_GROUP)
        );
        setRegistryName("nmod:test");

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
