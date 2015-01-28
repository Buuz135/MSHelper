package com.buuz135.mshelper.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MSConstructor extends MSBlock {

	public MSConstructor() {
		super();
		this.setBlockName("constructor");
		this.setCreativeTab(new CreativeTabs("MSHelper") {

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return Items.command_block_minecart;
			}
		});

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = Blocks.command_block.getBlockTextureFromSide(0);
	}

}
