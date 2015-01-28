package com.buuz135.mshelper.init;

import com.buuz135.mshelper.blocks.MSBlock;
import com.buuz135.mshelper.blocks.MSConstructor;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlock {
	
	public static final MSBlock constructor = new MSConstructor();
	
	public static void init(){
		GameRegistry.registerBlock(constructor, "constructor");
	}
}
