package com.starfall.nmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

//��������ʾ��
//�̳�Block��
public class TestBlock extends Block {
    //���÷���ȫ�ֱ�����[���������Ʒ]
    public static final String NAME = "nmod:testblock";
    //���캯��
    public TestBlock(){
        //���ø��๹�캯��
        super(Properties.create(Material.WOOD)//���÷������[�����������]
                .hardnessAndResistance(1.0f)//����Ӳ�ȺͿ���
                .lightValue(14)//��������
        );
        setRegistryName(NAME);//���÷���ע����
    }

}
