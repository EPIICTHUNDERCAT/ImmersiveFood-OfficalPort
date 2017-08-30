/*    */ package com.hedgehogpie12.food.mod.init;
/*    */ 
/*    */ import net.minecraft.init.Items;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*    */ 
/*    */ public class ModRecipes
/*    */ {
/*    */   public static void init()
/*    */   {
/* 11 */     GameRegistry.addRecipe(new ItemStack(ModItems.carrot_soup), new Object[] { "CCC", "CCC", " B ", Character.valueOf('C'), Items.CARROT, Character.valueOf('B'), Items.BOWL });
/* 12 */     GameRegistry.addRecipe(new ItemStack(ModItems.potato_soup), new Object[] { "PPP", "PPP", " B ", Character.valueOf('P'), Items.POTATO, Character.valueOf('B'), Items.BOWL });
/*    */     
/* 14 */     GameRegistry.addSmelting(new ItemStack(ModItems.raw_horse_meat), new ItemStack(ModItems.cooked_horse_meat), 0.35F);
/*    */   }
/*    */ }


/* Location:              /Users/user/Desktop/Decompilers/Deof/ImmersiveFood-1.0.0-deobf.jar!/com/hedgehogpie12/food/mod/init/ModRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */