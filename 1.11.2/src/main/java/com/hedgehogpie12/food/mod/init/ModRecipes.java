package com.hedgehogpie12.food.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModItems.carrot_soup), new Object[] { "CCC", "CCC", " B ",
				'C', Items.CARROT, 'B', Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.filled_squid_meat), new Object[] { "a", "b",
				'a', Items.FLINT, 'b', ModItems.raw_squid_meat });

		GameRegistry.addRecipe(new ItemStack(ModItems.potato_soup), new Object[] { "PPP", "PPP", " B ",
				Character.valueOf('P'), Items.POTATO, Character.valueOf('B'), Items.BOWL });
		// Horse 1
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_horse_meat), new ItemStack(ModItems.cooked_horse_meat),
				0.35F);
		// Llama 2
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_llama_meat), new ItemStack(ModItems.cooked_llama_meat),
				0.35F);
		// Bat 3
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_bat_meat), new ItemStack(ModItems.cooked_bat_meat), 0.35F);
		// Donkey 4
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_donkey_meat), new ItemStack(ModItems.cooked_donkey_meat),
				0.35F);
		// Mule 5
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_mule_meat), new ItemStack(ModItems.cooked_mule_meat),
				0.35F);
		// Squid 6
		GameRegistry.addSmelting(new ItemStack(ModItems.filled_squid_meat), new ItemStack(ModItems.cooked_squid_meat),
				0.35F);
		// Ocelot 7
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_ocelot_meat), new ItemStack(ModItems.cooked_ocelot_meat),
				0.35F);
		// Wolf 8
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_wolf_meat), new ItemStack(ModItems.cooked_wolf_meat),
				0.35F);
		// Dragon 9
		GameRegistry.addSmelting(new ItemStack(ModItems.raw_dragon_meat), new ItemStack(ModItems.cooked_dragon_meat),
				0.35F);
		// Bat Wing 10
		GameRegistry.addSmelting(new ItemStack(ModItems.bat_wing), new ItemStack(ModItems.cooked_bat_wing), 0.35F);

	}
}
