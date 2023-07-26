package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.crafting.Ingredient;

public class TestPickaxe extends ItemPickaxe {

    public TestPickaxe() {
        super(new TierTool(100,5F,0,3,3, Ingredient.EMPTY)
                ,2,-3
                ,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)
        );
        setRegistryName("nmod:testpickaxe");
    }
}
