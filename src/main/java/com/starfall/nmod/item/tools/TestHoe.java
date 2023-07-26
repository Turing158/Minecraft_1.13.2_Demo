package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.item.Test;
import com.starfall.nmod.util.TierTool;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.crafting.Ingredient;


//创建锄头工具示例
//继承 ItemHoe 类
public class TestHoe extends ItemHoe {
    //构造函数
    public TestHoe(){
        //在创建工具之前，需要新建一个 TierTool 类，这个类的示例在 util 包下
        //通过 new TierTool() 创建一个工具,这个类的构造函数有 7 个参数
        //maxUser:最大使用次数，当使用次数达到这个值的时候，工具就会损坏
        //efficiency:效率，这个值越大，工具的使用速度越快
        //attackDamage:[这个暂时设置为零]攻击伤害，这个值越大，工具的攻击伤害越高
        //harvestLevel:收割等级，这个值越大，工具可以收割更硬的方块
        //enchantability:能附魔多少次，这个值越大，工具可以附魔的次数越多
        //repairMaterial:修复材料，这个值是一个 Ingredient 类型，通过Ingredient.fromItems(值)来创建,值为物品
        //p_i48488_2_:攻击速度,初始值为 4 ,变量填多少值，这个工具攻击速度就为 值+1
        //Properties: 通过new Properties()设置物品其他属性
        super(new TierTool(200,1F,0,3,2, Ingredient.EMPTY)
                ,10,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)//设置物品组
        );
        setRegistryName("nmod:testhoe");//设置物品注册名
    }
}
