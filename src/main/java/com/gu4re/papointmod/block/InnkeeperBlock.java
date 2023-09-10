package com.gu4re.papointmod.block;

import com.gu4re.papointmod.PapoIntMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InnkeeperBlock {
	// Collector
	public static final DeferredRegister<Block> INNKEEPER_DEFERRED_REGISTER_BLOCK =
			DeferredRegister.create(ForgeRegistries.BLOCKS, PapoIntMod.MODID);
	public static final DeferredRegister<Item> INNKEEPER_DEFERRED_REGISTER_ITEM =
			DeferredRegister.create(ForgeRegistries.ITEMS, PapoIntMod.MODID);
	
	// Inkeeper Block
	public static final RegistryObject<Block> INNKEEPER_BLOCK =
			INNKEEPER_DEFERRED_REGISTER_BLOCK.register("innkeeper_block",
					() -> new Block(BlockBehaviour.Properties
							.of(Material.STONE)
							.strength(10, 50)
							.isRedstoneConductor((p_61036_, p_61037_, p_61038_) -> true)
							.lightLevel(blockState -> 15))
			);
	public static final RegistryObject<Item> INNKEEPER_BLOCK_ITEM =
			INNKEEPER_DEFERRED_REGISTER_ITEM.register("innkeeper_block",
					() -> new BlockItem(INNKEEPER_BLOCK.get(),
							new Item.Properties()
									.setNoRepair()
									.rarity(Rarity.EPIC)
									.durability(0)
					));
	private InnkeeperBlock(){}
}
