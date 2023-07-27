package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

//�������ӹ���ʾ��
//�̳� ItemSpade ��[�ص�̳е��� ItemSpade ��,���� ItemShovel ��,��Ϊ ItemShovel ���Ѿ���������]
public class TestShovel extends ItemSpade {
    public TestShovel(){
        //�ڴ�������֮ǰ����Ҫ�½�һ�� TierTool �࣬������ʾ���� util ����
        //ͨ�� new TierTool() ����һ������,�����Ĺ��캯���� 7 ������
        //maxUser:���ʹ�ô�������ʹ�ô����ﵽ���ֵ��ʱ�򣬹��߾ͻ���
        //efficiency:Ч�ʣ����ֵԽ�󣬹��ߵ�ʹ���ٶ�Խ��
        //attackDamage:[�����ʱ����Ϊ��]�����˺������ֵԽ�󣬹��ߵĹ����˺�Խ��
        //harvestLevel:�ո�ȼ������ֵԽ�󣬹��߿����ո��Ӳ�ķ���
        //enchantability:�ܸ�ħ���ٴΣ����ֵԽ�󣬹��߿��Ը�ħ�Ĵ���Խ��
        //repairMaterial:�޸����ϣ����ֵ��һ�� Ingredient ���ͣ�ͨ��Ingredient.fromItems(ֵ)������,ֵΪ��Ʒ
        //attackDamageIn:�����˺�,����˺���ʼֵΪ 1 ,���������ֵ����������˺���Ϊ ֵ+1
        //attackSpeedIn:�����ٶ�,��ʼֵΪ 4 ,���������ֵ��������߹����ٶȾ�Ϊ ֵ+1
        //Properties: ͨ��new Properties()������Ʒ��������
        super(new TierTool(100,5F,0,3,3, Ingredient.EMPTY)
                ,3,-3,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)//������Ʒ��
        );
        setRegistryName("nmod:testshovel");//������Ʒע����
    }

}
