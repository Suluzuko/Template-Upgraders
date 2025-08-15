/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suluzuko.upgradertemplates.init;

import net.suluzuko.upgradertemplates.UpgradertemplatesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class UpgradertemplatesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UpgradertemplatesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SMITHING_TEMPLATES = REGISTRY.register("smithing_templates",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.upgradertemplates.smithing_templates")).icon(() -> new ItemStack(UpgradertemplatesModItems.IRON_TEMPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UpgradertemplatesModItems.STONE_TEMPLATE.get());
				tabData.accept(UpgradertemplatesModItems.IRON_TEMPLATE.get());
				tabData.accept(UpgradertemplatesModItems.GOLD_TEMPLATE.get());
				tabData.accept(UpgradertemplatesModItems.DIAMOND_TEMPLATE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(UpgradertemplatesModItems.STONE_TEMPLATE.get());
			tabData.accept(UpgradertemplatesModItems.IRON_TEMPLATE.get());
			tabData.accept(UpgradertemplatesModItems.GOLD_TEMPLATE.get());
			tabData.accept(UpgradertemplatesModItems.DIAMOND_TEMPLATE.get());
		}
	}
}