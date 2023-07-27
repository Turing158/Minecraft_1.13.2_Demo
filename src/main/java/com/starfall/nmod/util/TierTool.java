package com.starfall.nmod.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

//创建工具属性类
//继承 IItemTier 接口
//这个类的作用是设置工具的属性
public class TierTool implements IItemTier {
    int maxUses;//最大使用次数
    float efficiency;//效率
    float attackDamage;//攻击伤害
    int harvestLevel;//收割等级
    int enchantability;//附魔等级
    Ingredient repairMaterial;//修复材料

    //剩下的都是构造函数和get/set方法
    public TierTool(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Ingredient repairMaterial) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}
