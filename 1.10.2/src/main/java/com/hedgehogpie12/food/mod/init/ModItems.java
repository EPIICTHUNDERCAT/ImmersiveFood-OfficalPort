/*    */ package com.hedgehogpie12.food.mod.init;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.ItemModelMesher;
/*    */ import net.minecraft.client.renderer.RenderItem;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*    */ 
/*    */ 
/*    */ public class ModItems
/*    */ {
/*    */   public static Item raw_horse_meat;
/*    */   public static Item cooked_horse_meat;
/*    */   public static Item carrot_soup;
/*    */   public static Item potato_soup;
/*    */   
/*    */   public static void init()
/*    */   {
/* 21 */     raw_horse_meat = new ModFood(3, 1.8F, true).setUnlocalizedName("raw_horse_meat").setCreativeTab(CreativeTabs.FOOD);
/* 22 */     cooked_horse_meat = new ModFood(8, 12.8F, true).setUnlocalizedName("cooked_horse_meat").setCreativeTab(CreativeTabs.FOOD);
/*    */     
/* 24 */     carrot_soup = new ModFood(6, 7.2F, true).setUnlocalizedName("carrot_soup").setCreativeTab(CreativeTabs.FOOD);
/* 25 */     potato_soup = new ModFood(6, 7.2F, true).setUnlocalizedName("potato_soup").setCreativeTab(CreativeTabs.FOOD);
/*    */   }
/*    */   
/*    */   public static void register()
/*    */   {
/* 30 */     GameRegistry.registerItem(raw_horse_meat, "raw_horse_meat");
/* 31 */     GameRegistry.registerItem(cooked_horse_meat, "cooked_horse_meat");
/*    */     
/* 33 */     GameRegistry.registerItem(carrot_soup, "carrot_soup");
/* 34 */     GameRegistry.registerItem(potato_soup, "potato_soup");
/*    */   }
/*    */   
/*    */   public static void registerRenders()
/*    */   {
/* 39 */     registerRender(raw_horse_meat);
/* 40 */     registerRender(cooked_horse_meat);
/*    */     
/* 42 */     registerRender(carrot_soup);
/* 43 */     registerRender(potato_soup);
/*    */   }
/*    */   
/*    */   public static void registerRender(Item item)
/*    */   {
/* 48 */     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("immersivefood:" + item.getUnlocalizedName().substring(5), "inventory"));
/*    */   }
/*    */ }


/* Location:              /Users/user/Desktop/Decompilers/Deof/ImmersiveFood-1.0.0-deobf.jar!/com/hedgehogpie12/food/mod/init/ModItems.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */