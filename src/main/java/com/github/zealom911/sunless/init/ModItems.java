package com.github.zealom911.sunless.init;

import net.minecraft.item.Item;

import com.github.zealom911.sunless.help.RegisterHelper;
import com.github.zealom911.sunless.items.ItemSunless;

public class ModItems 
{
	public static void registerItems()
	{
		RegisterHelper.registerItem(omega);
	}
	
	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(omega);
	}
	
	public static Item omega = new ItemSunless().setUnlocalizedName("omega");

}
