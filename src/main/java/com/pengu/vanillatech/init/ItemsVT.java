package com.pengu.vanillatech.init;

import net.minecraft.item.Item;

import com.pengu.hammercore.utils.NPEUtils;
import com.pengu.vanillatech.items.ItemBackpack;
import com.pengu.vanillatech.items.ItemCheatRecipeBook;
import com.pengu.vanillatech.items.ItemEnhancedPickaxe;
import com.pengu.vanillatech.items.ItemNetherStarShard;
import com.pengu.vanillatech.items.ItemShieldTotem;
import com.pengu.vanillatech.items.ItemVTHidden;

public class ItemsVT
{
	{
		NPEUtils.noInstancesError();
	}
	
	public static final Item //
	        SHIELD_TOTEM = new ItemShieldTotem(), //
	        CREATIVE_RECIPE_BOOK = new ItemCheatRecipeBook(), //
	        BACKPACK = new ItemBackpack(), //
	        NETHERSTAR_SHARD = new ItemNetherStarShard(), //
	        ENHANCED_PICKAXE = new ItemEnhancedPickaxe(), //
	        UNSTABLE_METAL_INGOT = new Item().setUnlocalizedName("unstable_metal_ingot"), //
	        ANRIATPHYTE_CRYSTAL = new Item().setUnlocalizedName("crystal_anriatphyte"), //
	        HIDDEN = new ItemVTHidden();
}