package com.starfall.nmod.item.tools;

import com.starfall.nmod.group.TestItemGroup;
import com.starfall.nmod.util.TierTool;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.crafting.Ingredient;



//������ͷ����ʾ��
//�̳� ItemAxe ��
public class TestAxe extends ItemAxe{
    //���캯��
    public TestAxe(){
        //�ڴ�������֮ǰ����Ҫ�½�һ�� TierTool �࣬������ʾ���� util ����
        //ͨ�� new TierTool() ����һ������,�����Ĺ��캯���� 7 ������
        //maxUser:���ʹ�ô�������ʹ�ô����ﵽ���ֵ��ʱ�򣬹��߾ͻ���
        //efficiency:Ч�ʣ����ֵԽ�󣬹��ߵ�ʹ���ٶ�Խ��
        //attackDamage:[�����ʱ����Ϊ��]�����˺������ֵԽ�󣬹��ߵĹ����˺�Խ��
        //harvestLevel:�ո�ȼ������ֵԽ�󣬹��߿����ո��Ӳ�ķ���
        //enchantability:�ܸ�ħ���ٴΣ����ֵԽ�󣬹��߿��Ը�ħ�Ĵ���Խ��
        //repairMaterial:�޸����ϣ����ֵ��һ�� Ingredient ���ͣ�ͨ��Ingredient.fromItems(ֵ)������,ֵΪ��Ʒ
        //p_i48530_2_:�����ʾ�����˺�,��֪��Ϊʲô������������,����˺���ʼֵΪ 1 ,���������ֵ����������˺���Ϊ ֵ+1
        //attackSpeedIn:�����ٶ�,��ʼֵΪ 4 ,���������ֵ��������߹����ٶȾ�Ϊ ֵ+1
        //Properties: ͨ��new Properties()������Ʒ��������

//                            ʹ�ô���      Ч��     �����˺�[�ɺ���]  �ո�ȼ�[������] �ܸ�ħ���ٴ�          �޸�����              �˺�[��ʼ��1������ټӶ���] �����ٶ�[��ʼ4������ټӶ���]
        super(new TierTool(10,8F,0,1,100,Ingredient.fromItems(Items.DIAMOND)),0,0,new Properties()
                        .group(TestItemGroup.TEST_TOOL_GROUP)//������Ʒ��
                );
        setRegistryName("nmod:testaxe");//������Ʒע����

    }
}
