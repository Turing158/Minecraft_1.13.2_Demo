package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.crafting.Ingredient;



//创建斧头工具示例
//继承 ItemAxe 类
public class TestAxe extends ItemAxe{
    //构造函数
    public TestAxe(){
        //在创建工具之前，需要新建一个 TierTool 类，这个类的示例在 util 包下
        //通过 new TierTool() 创建一个工具,这个类的构造函数有 7 个参数
        //maxUser:最大使用次数，当使用次数达到这个值的时候，工具就会损坏
        //efficiency:效率，这个值越大，工具的使用速度越快
        //attackDamage:[这个暂时设置为零]攻击伤害，这个值越大，工具的攻击伤害越高
        //harvestLevel:收割等级，这个值越大，工具可以收割更硬的方块
        //enchantability:能附魔多少次，这个值越大，工具可以附魔的次数越多
        //repairMaterial:修复材料，这个值是一个 Ingredient 类型，通过Ingredient.fromItems(值)来创建,值为物品
        //p_i48530_2_:这个表示工具伤害,不知道为什么变量名是这样,这个伤害初始值为 1 ,变量填多少值，这个工具伤害就为 值+1
        //attackSpeedIn:攻击速度,初始值为 4 ,变量填多少值，这个工具攻击速度就为 值+1
        //Properties: 通过new Properties()设置物品其他属性

//                            使用次数      效率     攻击伤害[可忽略]  收割等级[镐子用] 能附魔多少次          修复材料              伤害[初始有1，填多少加多少] 攻击速度[初始4，填多少加多少]
        super(new TierTool(10,8F,0,1,100,Ingredient.fromItems(Items.DIAMOND)),0,0,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)//设置物品组
                );
        setRegistryName("nmod:testaxe");//设置物品注册名

    }
}
