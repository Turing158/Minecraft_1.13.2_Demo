package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.crafting.Ingredient;

public class TestAxe extends ItemAxe{
    public TestAxe(){
//                            ʹ�ô���      Ч��     �����˺�[�ɺ���]  �ո�ȼ�[������] �ܸ�ħ���ٴ�          �޸�����              �˺�[��ʼ��1������ټӶ���] �����ٶ�[��ʼ4������ټӶ���]
        super(new TierTool(10,8F,0,1,100,Ingredient.fromItems(Items.DIAMOND)),0,0,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)
                );
        setRegistryName("nmod:testaxe");

    }
}
