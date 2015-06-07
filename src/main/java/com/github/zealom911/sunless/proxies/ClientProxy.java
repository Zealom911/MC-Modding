package com.github.zealom911.sunless.proxies;

import com.github.zealom911.sunless.init.ModBlocks;
import com.github.zealom911.sunless.init.ModItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		ModItems.registerItemRenderer();
		ModBlocks.registerBlockRenderer();
	}

}
