package com.starfall.nmod.item;

import com.starfall.nmod.group.TestItemGroup;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

//������Ʒʾ��
//�̳�Item��
public class Test extends Item {
    //���캯��
    public Test() {
        //���ø��๹�캯��
        //����ʹ�� Item.Properties() ������Ʒ����
        super(new Item.Properties()
                .maxStackSize(16)//�������ѵ�����
                .group(TestItemGroup.TEST_ITEM_GROUP)//������Ʒ��
        );
        setRegistryName("nmod:test");//������Ʒע����

    }


    //��д onItemRightClick ����
    //����������Ҽ������Ʒ��ʱ�򴥷��ķ���
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
