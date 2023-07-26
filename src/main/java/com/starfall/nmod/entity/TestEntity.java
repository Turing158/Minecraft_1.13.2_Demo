package com.starfall.nmod.entity;

import net.minecraft.client.renderer.entity.model.ModelBase;
import net.minecraft.client.renderer.entity.model.ModelBox;
import net.minecraft.client.renderer.entity.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TestEntity extends ModelBase{
    private final ModelRenderer bb_main;

    public TestEntity() {
        textureWidth = 64;
        textureHeight = 64;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -14.0F, -6.0F, 14, 14, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 27, -4.0F, -22.0F, -3.0F, 8, 8, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 1, 0, 7.0F, -11.0F, -1.0F, 3, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 1, 0, -10.0F, -11.0F, -1.0F, 3, 10, 3, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bb_main.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
