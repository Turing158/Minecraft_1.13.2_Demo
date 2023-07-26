package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.Ingredient;

public class TestSword extends ItemSword{
    public TestSword() {
        super(new TierTool(100,0,0,0,0, Ingredient.EMPTY)
                ,9,-3F
                ,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)
        );
        setRegistryName("nmod:testsword");
    }
}
