package com.buuz135.mshelper.client.gui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.buuz135.mshelper.handler.ConfigHandler;
import com.buuz135.mshelper.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.config.Property.Type;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ConfigGui extends GuiConfig {
	private static List<IConfigElement> list = new ArrayList<IConfigElement>(); 
	public ConfigGui(GuiScreen guiScreen){
		super(guiScreen,list , Reference.MOD_ID, false, true, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
		list.clear();
		list.add(new ConfigElement(ConfigHandler.config.getCategory("modules")));
		//Add diferent categories
	}
}
