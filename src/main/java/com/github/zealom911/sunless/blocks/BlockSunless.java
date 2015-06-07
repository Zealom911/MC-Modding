package com.github.zealom911.sunless.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSunless extends Block

{
	public BlockSunless(float hardness, float resistence, String harvestType, int harvestLevel, float lightLevel)
	{
		super(Material.rock);//material types here
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeStone);
		this.setHardness(hardness); //how long it takes to break
		this.setResistance(resistence); // resistance to explosives
		this.setHarvestLevel(harvestType, harvestLevel);//what can break/material this block
		this.setLightLevel(lightLevel); // Light emitted (like glowstone)
	}
}
