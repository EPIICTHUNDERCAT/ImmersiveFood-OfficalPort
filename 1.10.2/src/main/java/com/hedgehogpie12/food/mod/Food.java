/*    */ package com.hedgehogpie12.food.mod;
/*    */ 
/*    */ import com.hedgehogpie12.food.mod.handler.MobDropsHandler;
/*    */ import com.hedgehogpie12.food.mod.init.ModItems;
/*    */ import com.hedgehogpie12.food.mod.init.ModRecipes;
/*    */ import net.minecraftforge.fml.common.FMLCommonHandler;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventHandler;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.EventBus;
/*    */ 
/*    */ @Mod(modid="immersivefood", name="Immersive Food", version="1.9-1.0.0", acceptedMinecraftVersions="[1.9]")
/*    */ public class Food
/*    */ {
/*    */   @Mod.EventHandler
/*    */   public void preInit(FMLPreInitializationEvent event)
/*    */   {
/* 20 */     ModItems.init();
/* 21 */     ModItems.register();
/* 22 */     ModRecipes.init();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @Mod.EventHandler
/*    */   public void Init(FMLInitializationEvent event) {}
/*    */   
/*    */ 
/*    */ 
/*    */   @Mod.EventHandler
/*    */   public void postInit(FMLPostInitializationEvent event)
/*    */   {
/* 36 */     FMLCommonHandler.instance().bus().register(new MobDropsHandler());
/*    */   }
/*    */ }


/* Location:              /Users/user/Desktop/Decompilers/Deof/ImmersiveFood-1.0.0-deobf.jar!/com/hedgehogpie12/food/mod/Food.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */