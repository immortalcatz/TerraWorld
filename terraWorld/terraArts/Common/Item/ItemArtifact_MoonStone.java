package terraWorld.terraArts.Common.Item;

import DummyCore.Utils.MathUtils;
import DummyCore.Utils.MiscUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArtifact_MoonStone extends ItemArtifact{

	public ItemArtifact_MoonStone() {
		super();
	}
	
	@Override
	public void onArtUpdate(ItemStack par1ItemStack, EntityPlayer p) {
		if(!p.worldObj.isDaytime())
		{
			p.addPotionEffect(new PotionEffect(Potion.damageBoost.id,10,0,true));
		}
	}
	
	@Override
	public float setDamage(ItemStack par1ItemStack, EntityPlayer p, float am) {
		return p.worldObj.isDaytime() ? am : am/1.5F;
	}

}
