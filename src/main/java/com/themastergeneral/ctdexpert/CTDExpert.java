package com.themastergeneral.ctdexpert;

import com.themastergeneral.ctdexpert.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CTDExpert.MODID, name = CTDExpert.MODNAME, version = CTDExpert.VERSION, acceptedMinecraftVersions = CTDExpert.acceptedMinecraftVersions, dependencies = CTDExpert.DEPENDENCIES)
public class CTDExpert 
{
	public static final String MODID = "ctdexpert";
    public static final String MODNAME = "CTD Expert Addons";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMinecraftVersions = "1.10.2";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.0.2,];";
    
    @Instance
    public static CTDExpert instance = new CTDExpert();
    
    
    @SidedProxy(clientSide="com.themastergeneral.ctdexpert.proxy.ClientProxy", serverSide="com.themastergeneral.ctdexpert.proxy.ServerProxy")
    public static CommonProxy proxy;
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
