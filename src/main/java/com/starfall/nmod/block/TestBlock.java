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

//创建方块示例
//继承Block类
public class TestBlock extends Block {
    //设置方块全局变量名[方便添加物品]
    public static final String NAME = "nmod:testblock";
    //构造函数
    public TestBlock(){
        //调用父类构造函数
        super(Properties.create(Material.WOOD)//设置方块材质[不是纹理材质]
                .hardnessAndResistance(1.0f)//设置硬度和抗爆
                .lightValue(14)//设置亮度
        );
        setRegistryName(NAME);//设置方块注册名
    }

}
