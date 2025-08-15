/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suluzuko.upgradertemplates.init;

import net.suluzuko.upgradertemplates.item.StoneTemplateItem;
import net.suluzuko.upgradertemplates.item.IronTemplateItem;
import net.suluzuko.upgradertemplates.item.GoldTemplateItem;
import net.suluzuko.upgradertemplates.item.DiamondTemplateItem;
import net.suluzuko.upgradertemplates.UpgradertemplatesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class UpgradertemplatesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(UpgradertemplatesMod.MODID);
	public static final DeferredItem<Item> STONE_TEMPLATE = REGISTRY.register("stone_template", StoneTemplateItem::new);
	public static final DeferredItem<Item> IRON_TEMPLATE = REGISTRY.register("iron_template", IronTemplateItem::new);
	public static final DeferredItem<Item> DIAMOND_TEMPLATE = REGISTRY.register("diamond_template", DiamondTemplateItem::new);
	public static final DeferredItem<Item> GOLD_TEMPLATE = REGISTRY.register("gold_template", GoldTemplateItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}