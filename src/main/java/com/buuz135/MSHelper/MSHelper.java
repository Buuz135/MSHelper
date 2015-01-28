package com.buuz135.mshelper;

import com.buuz135.mshelper.handler.ConfigHandler;
import com.buuz135.mshelper.init.ModBlock;
import com.buuz135.mshelper.proxy.IProxy;
import com.buuz135.mshelper.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MSHelper {

	@Mod.Instance(Reference.MOD_ID)
	public static MSHelper instance;

	@SidedProxy(clientSide = Reference.MOD_PROXY_CLIENT, serverSide = Reference.MOD_PROXY_SERVER)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		ModBlock.init();
	}// Network, Config, Blocks, Items

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}// Gui, Tile, Recipes, Events

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}// After mods

}
