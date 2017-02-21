package com.themastergeneral.ctdexpert.items;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdexpert.CTDExpert;

public class Items extends RegisterItem 
{
	public static BasicItem platediamond;
	public static BasicItem platesilver;
	public static void registerItems()
	{
		platediamond = register(new BasicItem ("platediamond",CTDExpert.MODID));
		platesilver = register(new BasicItem ("platesilver",CTDExpert.MODID));
	}
}
