package com.gu4re.papointmod.tab;

import com.gu4re.papointmod.PapoIntMod;
import com.gu4re.papointmod.block.InnkeeperBlock;
import com.gu4re.papointmod.item.BackStoneItem;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = PapoIntMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PapoIntTab {
	@SubscribeEvent
	public static void buildContents(CreativeModeTabEvent.@NotNull Register event) {
		event.registerCreativeModeTab(new ResourceLocation(PapoIntMod.MODID, "papoint_tab"), builder ->
				builder
						.title(Component.translatable("item_group." + PapoIntMod.MODID + ".papoint_tab"))
						.icon(() -> new ItemStack(BackStoneItem.BACKSTONE_ITEM.get()))
						.displayItems((params, output, displayStatus) -> {
							output.accept(BackStoneItem.BACKSTONE_ITEM.get());
							output.accept(InnkeeperBlock.INNKEEPER_BLOCK_ITEM.get());
						})
		);
	}
}
