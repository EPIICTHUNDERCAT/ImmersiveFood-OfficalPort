/*    */ package com.hedgehogpie12.food.mod.handler;
/*    */ 
/*    */ import com.hedgehogpie12.food.mod.init.ModItems;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.entity.passive.EntityHorse;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.event.entity.living.LivingDropsEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MobDropsHandler
/*    */ {
/*    */   @SubscribeEvent
/*    */   public void onMobDrops(LivingDropsEvent event)
/*    */   {
/* 21 */     if ((event.getEntity() instanceof EntityHorse))
/*    */     {
/*    */ 
/*    */ 
/* 25 */       ItemStack stack = new ItemStack(ModItems.raw_horse_meat, 2);
/* 26 */       EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
/*    */       
/* 28 */       event.getDrops().add(drop);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/user/Desktop/Decompilers/Deof/ImmersiveFood-1.0.0-deobf.jar!/com/hedgehogpie12/food/mod/handler/MobDropsHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */