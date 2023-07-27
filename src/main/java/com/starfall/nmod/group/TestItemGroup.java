package com.starfall.nmod.group;

import com.starfall.nmod.block.TestBlock;
import com.starfall.nmod.item.tools.TestAxe;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;


//������Ʒ��ʾ��[���磺��������ĸ���Ʒ�飬��Ʒ�����ĸ���Ʒ��......]
//�̳�ItemGroup��[�ص�������ǳ�����]
public abstract class TestItemGroup extends ItemGroup {

    //������Ʒ��ʾ��
    //ͨ����̬ȫ�ֱ��� new һ����Ʒ��[TestItemGroup]
    //Ȼ����ע����Ʒ���ʱ��ֱ�ӵ������ȫ�ֱ��� TEST_ITEM_GROUP
    //�ص���������������� ItemGroup
    //new ��ʱ���� new TestItemGroup()
    //��������������� index �� label
    //index ����Ʒ�������,ֱ��ʹ�� ItemGroup.GROUPS.length ����
    //label ����Ʒ�������,ֱ��ʹ���ַ�������,����ע�������ǩ��ü������,�������ͨ��json����
    //====================================================================================================
    public static final ItemGroup TEST_ITEM_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testItemGroup") {
        //������д createIcon ����
        //��������Ǵ�����Ʒ���ͼ��
        //����ͨ��Items���ȡ��Ʒ
        //Ҳ����ͨ��ForgeRegistries.ITEMS.getValue(new ResourceLocation("ģ������:��Ʒģ��"))��ȡ�Լ���������Ʒ
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.ARROW);
        }
    };
    //====================================================================================================



    //������Ʒ��ʾ��
    //====================================================================================================
    public static final ItemGroup TEST_TOOL_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testToolGroup") {

        @Override
        public ItemStack createIcon() {
            //�����ʹ�����Լ���������Ʒ����Ϊ��Ʒ���ͼ��
            //��ͨ��ForgeRegistries.ITEMS.getValue(new ResourceLocation("ģ������:��Ʒģ��"))��ȡ�Լ���������Ʒ
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("nmod:testaxe")));
        }
    };
    //====================================================================================================




    //������Ʒ��ʾ��
    //====================================================================================================
    public static final ItemGroup TEST_BLOCK_GROUP = new TestItemGroup(ItemGroup.GROUPS.length,"testToolGroup") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.COAL);
        }
    };
    //====================================================================================================

    //������Ҫ��д���캯��,��Ϊ����Ĺ��캯���� protected ��
    //�����޷�������Ʒ��
    public TestItemGroup(int index, String label) {
        super(index, label);
    }
}
