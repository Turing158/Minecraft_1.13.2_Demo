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


//创建物品组示例[例如：方块放在哪个物品组，物品放在哪个物品组......]
//继承ItemGroup类[重点这个类是抽象类]
public abstract class TestItemGroup extends ItemGroup {

    //创建物品组示例
    //通过静态全局变量 new 一个物品组[TestItemGroup]
    //然后在注册物品组的时候直接调用这个全局变量 TEST_ITEM_GROUP
    //重点这个变量的类型是 ItemGroup
    //new 的时候是 new TestItemGroup()
    //里面包含两个属性 index 和 label
    //index 是物品组的索引,直接使用 ItemGroup.GROUPS.length 即可
    //label 是物品组的名字,直接使用字符串即可,但是注意这个标签最好简洁明了,方便后期通过json改名
    //====================================================================================================
    public static final ItemGroup TEST_ITEM_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testItemGroup") {
        //这里重写 createIcon 方法
        //这个方法是创建物品组的图标
        //可以通过Items类获取物品
        //也可以通过ForgeRegistries.ITEMS.getValue(new ResourceLocation("模组名称:物品模组"))获取自己创建的物品
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.ARROW);
        }
    };
    //====================================================================================================



    //创建物品组示例
    //====================================================================================================
    public static final ItemGroup TEST_TOOL_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testToolGroup") {

        @Override
        public ItemStack createIcon() {
            //这里就使用了自己创建的物品来作为物品组的图标
            //即通过ForgeRegistries.ITEMS.getValue(new ResourceLocation("模组名称:物品模组"))获取自己创建的物品
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("nmod:testaxe")));
        }
    };
    //====================================================================================================




    //创建物品组示例
    //====================================================================================================
    public static final ItemGroup TEST_BLOCK_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testToolGroup") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.COAL);
        }
    };
    //====================================================================================================

    //这里需要重写构造函数,因为父类的构造函数是 protected 的
    //否则无法创建物品组
    public TestItemGroup(int index, String label) {
        super(index, label);
    }
}
