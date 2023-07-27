package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.item.Test;
import com.starfall.nmod.util.TierTool;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.crafting.Ingredient;


//������ͷ����ʾ��
//�̳� ItemHoe ��
public class TestHoe extends ItemHoe {
    //���캯��
    public TestHoe(){
        //�ڴ�������֮ǰ����Ҫ�½�һ�� TierTool �࣬������ʾ���� util ����
        //ͨ�� new TierTool() ����һ������,�����Ĺ��캯���� 7 ������
        //maxUser:���ʹ�ô�������ʹ�ô����ﵽ���ֵ��ʱ�򣬹��߾ͻ���
        //efficiency:Ч�ʣ����ֵԽ�󣬹��ߵ�ʹ���ٶ�Խ��
        //attackDamage:[�����ʱ����Ϊ��]�����˺������ֵԽ�󣬹��ߵĹ����˺�Խ��
        //harvestLevel:�ո�ȼ������ֵԽ�󣬹��߿����ո��Ӳ�ķ���
        //enchantability:�ܸ�ħ���ٴΣ����ֵԽ�󣬹��߿��Ը�ħ�Ĵ���Խ��
        //repairMaterial:�޸����ϣ����ֵ��һ�� Ingredient ���ͣ�ͨ��Ingredient.fromItems(ֵ)������,ֵΪ��Ʒ
        //p_i48488_2_:�����ٶ�,��ʼֵΪ 4 ,���������ֵ��������߹����ٶȾ�Ϊ ֵ+1
        //Properties: ͨ��new Properties()������Ʒ��������
        super(new TierTool(200,1F,0,3,2, Ingredient.EMPTY)
                ,10,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)//������Ʒ��
        );
        setRegistryName("nmod:testhoe");//������Ʒע����
    }
}
