package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.item.Test;
import com.starfall.nmod.util.TierTool;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.crafting.Ingredient;

public class TestHoe extends ItemHoe {
    public TestHoe(){
        super(new TierTool(200,1F,0,3,2, Ingredient.EMPTY)
                ,10,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)
        );
        setRegistryName("nmod:testhoe");
    }
}
