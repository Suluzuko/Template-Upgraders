package net.suluzuko.upgradertemplates.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DiamondTemplateItem extends Item {
	public DiamondTemplateItem() {
		super(new Item.Properties());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.upgradertemplates.diamond_template.description_0"));
		list.add(Component.translatable("item.upgradertemplates.diamond_template.description_1"));
		list.add(Component.translatable("item.upgradertemplates.diamond_template.description_2"));
		list.add(Component.translatable("item.upgradertemplates.diamond_template.description_3"));
		list.add(Component.translatable("item.upgradertemplates.diamond_template.description_4"));
		list.add(Component.translatable("item.upgradertemplates.diamond_template.description_5"));
	}
}