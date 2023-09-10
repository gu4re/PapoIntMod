package com.gu4re.papointmod;

import com.gu4re.papointmod.block.InnkeeperBlock;
import com.gu4re.papointmod.item.BackStoneItem;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PapoIntMod.MODID)
public class PapoIntMod {
	// Define mod id in a common place for everything to reference
	public static final String MODID = "papointmod";
	// Directly reference a slf4j logger
	private static final Logger LOGGER = LogUtils.getLogger();
	// Create a Deferred Register to hold Blocks which will all be registered under the "papointmod" namespace
	
	public PapoIntMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		// Register the commonSetup method for modloading
		modEventBus.addListener(this::commonSetup);
		
		// Register BackStone
		BackStoneItem.BACKSTONE_DEFERRED_REGISTER.register(modEventBus);
		
		// Register InnkeeperBlock
		InnkeeperBlock.INNKEEPER_DEFERRED_REGISTER_ITEM.register(modEventBus);
		InnkeeperBlock.INNKEEPER_DEFERRED_REGISTER_BLOCK.register(modEventBus);
		
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void commonSetup(final FMLCommonSetupEvent event) {
		// Some common setup code
		LOGGER.info("[PAPOINTMOD] Setup realizado correctamente");
	}
}
