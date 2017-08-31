package com.hedgehogpie12.food.mod.handler;

import com.hedgehogpie12.food.mod.Reference;
import com.hedgehogpie12.food.mod.init.ModItems;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent event) {
		if ((event.getEntity() instanceof EntityHorse)) {

			ItemStack stack = new ItemStack(ModItems.raw_horse_meat, Reference.HORSE_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}

		if ((event.getEntity() instanceof EntityBat)) {

			ItemStack stack = new ItemStack(ModItems.raw_bat_meat, Reference.BAT_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}
		if ((event.getEntity() instanceof EntityBat)) {

			ItemStack stack = new ItemStack(ModItems.bat_wing, Reference.BAT_WING_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}
		if ((event.getEntity() instanceof EntityOcelot)) {

			ItemStack stack = new ItemStack(ModItems.raw_ocelot_meat, Reference.OCELOT_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}
		if ((event.getEntity() instanceof EntityWolf)) {

			ItemStack stack = new ItemStack(ModItems.raw_wolf_meat, Reference.WOLF_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}
		if ((event.getEntity() instanceof EntitySquid)) {

			ItemStack stack = new ItemStack(ModItems.raw_squid_meat, Reference.SQUID_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}

		if ((event.getEntity() instanceof EntityDragon)) {

			ItemStack stack = new ItemStack(ModItems.raw_dragon_meat, Reference.DRAGON_DROP_AMOUNT);
			EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY,
					event.getEntity().posZ, stack);

			event.getDrops().add(drop);
		}
	}
}
