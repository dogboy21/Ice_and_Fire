package com.github.alexthe666.iceandfire.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.github.alexthe666.iceandfire.block.BlockEggInIce;
import com.github.alexthe666.iceandfire.core.ModBlocks;
import com.github.alexthe666.iceandfire.core.ModItems;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityEggInIce;
import com.github.alexthe666.iceandfire.enums.EnumDragonEgg;

public class EntityDragonEgg extends EntityLiving{

	public EntityDragonEgg(World worldIn) {
		super(worldIn);
		this.isImmuneToFire = true;
		this.setSize(0.45F, 0.55F);
	}
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
	}
	public void writeEntityToNBT(NBTTagCompound tag)
	{
		super.writeEntityToNBT(tag);
		tag.setByte("Color", (byte)this.getType().meta);
		tag.setByte("DragonAge", (byte)this.getDragonAge());

	}

	public void readEntityFromNBT(NBTTagCompound tag)
	{
		super.readEntityFromNBT(tag);
		this.setType(EnumDragonEgg.byMetadata(tag.getByte("Color")));
		this.setDragonAge(tag.getByte("DragonAge"));

	}

	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(18, 0);
		this.dataWatcher.addObject(19, 0);

	}

	public EnumDragonEgg getType()
	{
		return EnumDragonEgg.byMetadata(this.dataWatcher.getWatchableObjectInt(18));
	}

	public void setType(EnumDragonEgg newtype)
	{
		this.dataWatcher.updateObject(18, newtype.meta);
	}
	public boolean isEntityInvulnerable(DamageSource i)
	{
		return i.getEntity() != null;
	}
	public int getDragonAge()
	{
		return this.dataWatcher.getWatchableObjectInt(19);
	}

	public void setDragonAge(int i)
	{
		this.dataWatcher.updateObject(19, i);
	}

	public void onUpdate(){
		super.onUpdate();
		int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.posY);
		int k = MathHelper.floor_double(this.posZ);
		BlockPos pos = new BlockPos(i, j, k);
		if(worldObj.getBlockState(pos).getBlock().getMaterial() == Material.fire && getType().isFire){
			this.setDragonAge(this.getDragonAge() + 1);
		}
		if(worldObj.getBlockState(pos).getBlock().getMaterial() == Material.water && !getType().isFire && this.getRNG().nextInt(500) == 0){
			worldObj.setBlockState(pos, ModBlocks.eggInIce.getDefaultState());
			worldObj.playSoundEffect(i, j, k, "dig.glass", 1, 1);
			if(worldObj.getBlockState(pos).getBlock() instanceof BlockEggInIce){
				((TileEntityEggInIce)worldObj.getTileEntity(pos)).type = this.getType();
				this.setDead();
			}
		}
		if(this.getDragonAge() == 60){
			if(worldObj.getBlockState(pos).getBlock().getMaterial() == Material.fire && getType().isFire){
				worldObj.destroyBlock(pos, false);
				EntityFireDragon dragon = new EntityFireDragon(worldObj);
				dragon.setColor(getType().meta);
				dragon.setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
				if(!worldObj.isRemote){
					worldObj.spawnEntityInWorld(dragon);
				}
			}
			this.playSound("iceandfire:dragonegg.hatch", 1, 1);
			this.setDead();
		}
		/*if(this.getType().isFire){
			for (int i = 0; i < 2; ++i)
			{
				this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D, new int[0]);
			}
		}else{
			if(this.rand.nextInt(10) == 0){
				for (int i = -1; i < 0; ++i)
				{
					//IceAndFire.proxy.spawnParticle("snowflake", this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D);
					this.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height + 0.8D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D, new int[0]);
				}
			}
		}*/
	}

	public String getTexture(){
		String i = getType().isFire ? "firedragon/" : "icedragon/";
		return "iceandfire:textures/models/" + i + "egg_" + getType().name().toLowerCase() + ".png";

	}

	private boolean isAIDisabled()
	{
		return true;
	}

	public String getHurtSound(){
		return "none";	
	}

	@Override
	public boolean attackEntityFrom(DamageSource var1, float var2)
	{
		if(!worldObj.isRemote && !var1.canHarmInCreative()){
			this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, this.getItem()));
		}
		this.setDead();
		return super.attackEntityFrom(var1, var2);
	}

	private ItemStack getItem() {
		switch(getType().meta){
		default:
			return new ItemStack(ModItems.dragonegg_red);
		case 1:
			return new ItemStack(ModItems.dragonegg_green);
		case 2:
			return new ItemStack(ModItems.dragonegg_bronze);
		case 3:
			return new ItemStack(ModItems.dragonegg_gray);
		case 4:
			return new ItemStack(ModItems.dragonegg_blue);
		case 5:
			return new ItemStack(ModItems.dragonegg_white);
		case 6:
			return new ItemStack(ModItems.dragonegg_sapphire);
		case 7:
			return new ItemStack(ModItems.dragonegg_silver);

		}
	}
	public boolean canBePushed()
	{
		return false;
	}

	protected void collideWithEntity(Entity entity) {}
}