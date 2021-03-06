package com.github.alexthe666.iceandfire.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGorgonHeadActive extends ModelBase {
	public ModelRenderer Head;
	public ModelRenderer Head_Details;
	public ModelRenderer SnakeBaseR1;
	public ModelRenderer SnakeBaseR2;
	public ModelRenderer SnakeBaseR3;
	public ModelRenderer SnakeBaseR4;
	public ModelRenderer SnakeBaseL2;
	public ModelRenderer SnakeBaseL3;
	public ModelRenderer SnakeBaseL1;
	public ModelRenderer SnakeBaseL4;
	public ModelRenderer SnakeBodyR1;
	public ModelRenderer SnakeHeadR1;
	public ModelRenderer SnakeBodyR2;
	public ModelRenderer SnakeHeadR2;
	public ModelRenderer SnakeBodyR3;
	public ModelRenderer SnakeHeadR3;
	public ModelRenderer SnakeBodyR4;
	public ModelRenderer SnakeHeadR4;
	public ModelRenderer SnakeBodyL2;
	public ModelRenderer SnakeHeadL2;
	public ModelRenderer SnakeBodyL3;
	public ModelRenderer SnakeHeadR3_1;
	public ModelRenderer SnakeBodyL1;
	public ModelRenderer SnakeHeadL1;
	public ModelRenderer SnakeBodyL4;
	public ModelRenderer SnakeHeadL4;

	public ModelGorgonHeadActive() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.SnakeBaseR2 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseR2.setRotationPoint(-1.0F, -6.8F, 0.7F);
		this.SnakeBaseR2.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseR2, 0.3490658503988659F, -0.4363323129985824F, -0.8726646259971648F);
		this.SnakeBodyL4 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyL4.setRotationPoint(-0.0F, -5.4F, -0.4F);
		this.SnakeBodyL4.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyL4, 1.1344640137963142F, -0.5235987755982988F, 0.0F);
		this.SnakeHeadR4 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadR4.setRotationPoint(0.0F, -4.8F, 0.0F);
		this.SnakeHeadR4.addBox(-0.5F, -2.8F, -0.8F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadR4, 1.1383037381507017F, -0.045553093477052F, 0.31869712141416456F);
		this.SnakeBodyR2 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyR2.setRotationPoint(0.0F, -5.4F, -0.4F);
		this.SnakeBodyR2.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyR2, 0.5235987755982988F, 0.2617993877991494F, 0.0F);
		this.SnakeHeadR2 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadR2.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.SnakeHeadR2.addBox(0.0F, -3.6F, -0.6F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadR2, 0.8726646259971648F, -0.3302162944773272F, -0.6981317007977318F);
		this.SnakeBodyL1 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyL1.setRotationPoint(-0.0F, -5.4F, -0.4F);
		this.SnakeBodyL1.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyL1, 0.5009094953223726F, 0.0F, 0.0F);
		this.SnakeHeadR3_1 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadR3_1.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.SnakeHeadR3_1.addBox(-1.0F, -3.1F, -0.5F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadR3_1, 1.2747884856566583F, 0.0F, 0.5918411493512771F);
		this.Head_Details = new ModelRenderer(this, 32, 0);
		this.Head_Details.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head_Details.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.SnakeBaseR1 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseR1.setRotationPoint(-3.0F, -5.0F, 1.5F);
		this.SnakeBaseR1.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseR1, 0.6108652381980153F, 0.0F, -1.3962634015954636F);
		this.SnakeBodyR4 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyR4.setRotationPoint(-0.0F, -5.4F, -0.4F);
		this.SnakeBodyR4.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyR4, 1.1344640137963142F, 0.5235987755982988F, 0.0F);
		this.SnakeHeadL1 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadL1.mirror = true;
		this.SnakeHeadL1.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.SnakeHeadL1.addBox(-0.7F, -3.6F, -0.5F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadL1, 0.6373942428283291F, 0.091106186954104F, 0.27314402793711257F);
		this.SnakeBaseL4 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseL4.setRotationPoint(0.5F, -3.3F, 3.4F);
		this.SnakeBaseL4.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseL4, -0.5235987755982988F, 0.17453292519943295F, 1.5707963267948966F);
		this.SnakeBaseR4 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseR4.setRotationPoint(-0.5F, -3.3F, 3.4F);
		this.SnakeBaseR4.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseR4, -0.5235987755982988F, -0.17453292519943295F, -1.5707963267948966F);
		this.SnakeBaseL1 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseL1.setRotationPoint(3.0F, -5.0F, 1.5F);
		this.SnakeBaseL1.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseL1, 0.6108652381980153F, 0.0F, 1.3962634015954636F);
		this.SnakeHeadR3 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadR3.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.SnakeHeadR3.addBox(0.0F, -3.1F, -0.5F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadR3, 1.2747884856566583F, 0.0F, -0.5918411493512771F);
		this.SnakeBodyL3 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyL3.setRotationPoint(-0.0F, -5.4F, -0.4F);
		this.SnakeBodyL3.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyL3, 0.5235987755982988F, -0.3490658503988659F, 0.0F);
		this.SnakeBaseL3 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseL3.setRotationPoint(1.8F, -5.7F, 2.6F);
		this.SnakeBaseL3.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseL3, -0.2617993877991494F, 0.4363323129985824F, 0.8726646259971648F);
		this.SnakeBodyR3 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyR3.setRotationPoint(-0.0F, -5.4F, -0.4F);
		this.SnakeBodyR3.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyR3, 0.5235987755982988F, 0.3490658503988659F, 0.0F);
		this.SnakeHeadL2 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadL2.mirror = true;
		this.SnakeHeadL2.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.SnakeHeadL2.addBox(-1.0F, -3.6F, -0.6F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadL2, 0.8726646259971648F, 0.3490658503988659F, 0.6981317007977318F);
		this.SnakeBaseR3 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseR3.setRotationPoint(-1.8F, -5.7F, 2.6F);
		this.SnakeBaseR3.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseR3, -0.2617993877991494F, -0.4363323129985824F, -0.8726646259971648F);
		this.SnakeBodyR1 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyR1.setRotationPoint(-0.0F, -5.4F, -0.4F);
		this.SnakeBodyR1.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyR1, 0.5009094953223726F, 0.0F, 0.0F);
		this.SnakeBodyL2 = new ModelRenderer(this, 70, 0);
		this.SnakeBodyL2.mirror = true;
		this.SnakeBodyL2.setRotationPoint(0.0F, -5.4F, -0.4F);
		this.SnakeBodyL2.addBox(-0.5F, -5.5F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBodyL2, 0.5235987755982988F, -0.2617993877991494F, 0.0F);
		this.SnakeHeadR1 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadR1.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.SnakeHeadR1.addBox(-0.3F, -3.6F, -0.5F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadR1, 0.6373942428283291F, -0.091106186954104F, -0.27314402793711257F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 21.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.SnakeHeadL4 = new ModelRenderer(this, 80, 0);
		this.SnakeHeadL4.setRotationPoint(0.0F, -4.8F, 0.0F);
		this.SnakeHeadL4.addBox(-0.5F, -2.8F, -0.8F, 1, 3, 2, 0.0F);
		this.setRotateAngle(SnakeHeadL4, 1.1383037381507017F, 0.045553093477052F, -0.31869712141416456F);
		this.SnakeBaseL2 = new ModelRenderer(this, 60, 0);
		this.SnakeBaseL2.mirror = true;
		this.SnakeBaseL2.setRotationPoint(1.0F, -6.8F, 0.7F);
		this.SnakeBaseL2.addBox(-0.5F, -6.1F, -1.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(SnakeBaseL2, 0.3490658503988659F, 0.4363323129985824F, 0.8726646259971648F);
		this.Head_Details.addChild(this.SnakeBaseR2);
		this.SnakeBaseL4.addChild(this.SnakeBodyL4);
		this.SnakeBodyR4.addChild(this.SnakeHeadR4);
		this.SnakeBaseR2.addChild(this.SnakeBodyR2);
		this.SnakeBodyR2.addChild(this.SnakeHeadR2);
		this.SnakeBaseL1.addChild(this.SnakeBodyL1);
		this.SnakeBodyL3.addChild(this.SnakeHeadR3_1);
		this.Head.addChild(this.Head_Details);
		this.Head_Details.addChild(this.SnakeBaseR1);
		this.SnakeBaseR4.addChild(this.SnakeBodyR4);
		this.SnakeBodyL1.addChild(this.SnakeHeadL1);
		this.Head_Details.addChild(this.SnakeBaseL4);
		this.Head_Details.addChild(this.SnakeBaseR4);
		this.Head_Details.addChild(this.SnakeBaseL1);
		this.SnakeBodyR3.addChild(this.SnakeHeadR3);
		this.SnakeBaseL3.addChild(this.SnakeBodyL3);
		this.Head_Details.addChild(this.SnakeBaseL3);
		this.SnakeBaseR3.addChild(this.SnakeBodyR3);
		this.SnakeBodyL2.addChild(this.SnakeHeadL2);
		this.Head_Details.addChild(this.SnakeBaseR3);
		this.SnakeBaseR1.addChild(this.SnakeBodyR1);
		this.SnakeBaseL2.addChild(this.SnakeBodyL2);
		this.SnakeBodyR1.addChild(this.SnakeHeadR1);
		this.SnakeBodyL4.addChild(this.SnakeHeadL4);
		this.Head_Details.addChild(this.SnakeBaseL2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.Head.render(f5);
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
