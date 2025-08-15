package net.suluzuko.upgradertemplates.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class StoneTemplateItem extends Item {
	public StoneTemplateItem() {
		super(new Item.Properties().durability(8));
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.upgradertemplates.stone_template.description_0"));
		list.add(Component.translatable("item.upgradertemplates.stone_template.description_1"));
		list.add(Component.translatable("item.upgradertemplates.stone_template.description_2"));
		list.add(Component.translatable("item.upgradertemplates.stone_template.description_3"));
		list.add(Component.translatable("item.upgradertemplates.stone_template.description_4"));
		list.add(Component.translatable("item.upgradertemplates.stone_template.description_5"));
	}
}