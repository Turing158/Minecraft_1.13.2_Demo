package com.starfall.nmod.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

//��������������
//�̳� IItemTier �ӿ�
//���������������ù��ߵ�����
public class TierTool implements IItemTier {
    int maxUses;//���ʹ�ô���
    float efficiency;//Ч��
    float attackDamage;//�����˺�
    int harvestLevel;//�ո�ȼ�
    int enchantability;//��ħ�ȼ�
    Ingredient repairMaterial;//�޸�����

    //ʣ�µĶ��ǹ��캯����get/set����
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
