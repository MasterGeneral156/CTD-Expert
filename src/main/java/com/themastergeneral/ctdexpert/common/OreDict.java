package com.themastergeneral.ctdexpert.common;

import com.themastergeneral.ctdexpert.items.Items;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict 
{
	public static final void init() 
	 {
		 OreDictionary.registerOre("plateDiamond", Items.platediamond);
		 OreDictionary.registerOre("plateSilver", Items.platesilver);
	 }
}
