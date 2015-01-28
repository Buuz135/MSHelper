package com.buuz135.mshelper.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.buuz135.mshelper.reference.ConfigParm;
import com.buuz135.mshelper.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler {

	public static Configuration config;

	public static void init(File configFile) {
		if (config == null)
			config = new Configuration(configFile);
		loadConfig();
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfig();
		}
	}

	private static void loadConfig() {
		// config.load();
		// Modules
		ConfigParm.railcraft = config.get("Modules", "Railcraft", true)
				.getBoolean();
		ConfigParm.pneumaticraft = config.get("Modules", "Pneumaticraft", true)
				.getBoolean();
		// TC,TiCon,Botania,Chromaticraft,Automagy,MineChem,Forestry,PC,GT,BigReactors
		if (config.hasChanged())
			config.save();

	}
}
