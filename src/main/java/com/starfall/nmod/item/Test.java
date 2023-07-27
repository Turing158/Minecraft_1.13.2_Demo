package com.starfall.nmod.item;

import com.starfall.nmod.group.TestItemGroup;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

//创建物品示例
//继承Item类
public class Test extends Item {
    //构造函数
    public Test() {
        //调用父类构造函数
        //这里使用 Item.Properties() 创建物品属性
        super(new Item.Properties()
                .maxStackSize(16)//设置最大堆叠数量
                .group(TestItemGroup.TEST_ITEM_GROUP)//设置物品组
        );
        setRegistryName("nmod:test");//设置物品注册名

    }


    //重写 onItemRightClick 方法
    //这个方法是右键点击物品的时候触发的方法
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
