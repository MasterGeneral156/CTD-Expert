package com.themastergeneral.ctdexpert.proxy;

import com.themastergeneral.ctdexpert.common.OreDict;
import com.themastergeneral.ctdexpert.items.Items;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{

	public void preInit(FMLPreInitializationEvent e) 
	{
		Items.registerItems();
		OreDict.init();
	}

	public void init(FMLInitializationEvent e) 
	{

	}
	public void postInit(FMLPostInitializationEvent e) 
	{

	}
}
