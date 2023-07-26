package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.crafting.Ingredient;

public class TestAxe extends ItemAxe{
    public TestAxe(){
//                            使用次数      效率     攻击伤害[可忽略]  收割等级[镐子用] 能附魔多少次          修复材料              伤害[初始有1，填多少加多少] 攻击速度[初始4，填多少加多少]
        super(new TierTool(10,8F,0,1,100,Ingredient.fromItems(Items.DIAMOND)),0,0,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)
                );
        setRegistryName("nmod:testaxe");

    }
}
