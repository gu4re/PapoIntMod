package com.gu4re.papointmod.item;

import com.gu4re.papointmod.PapoIntMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BackStoneItem {
	// Collector
	public static final DeferredRegister<Item> BACKSTONE_DEFERRED_REGISTER =
			DeferredRegister.create(ForgeRegistries.ITEMS, PapoIntMod.MODID);
	
	// BackStone Item
	public static final RegistryObject<Item> BACKSTONE_ITEM =
			BACKSTONE_DEFERRED_REGISTER.register("backstone_item", () -> new Item(
					new Item.Properties()
							.setNoRepair()
							.defaultDurability(1)
							.rarity(Rarity.EPIC)
							.durability(1)
			));
	
	private BackStoneItem(){}
}
