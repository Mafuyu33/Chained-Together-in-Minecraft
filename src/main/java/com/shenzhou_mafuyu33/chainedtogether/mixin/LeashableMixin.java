//package com.mafuyu33.chainedtogether.mixin;
//
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResultHolder;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.Leashable;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//@Mixin(Leashable.class)
//public abstract interface LeashableMixin {
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;restoreLeashFromSave(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Leashable$LeashData;)V"))
////    private static <E extends Entity & Leashable> void init(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal("if (leashable$leashdata != null && leashable$leashdata.delayedLeashInfo != null) {"));
////	}
////
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;dropLeash(Lnet/minecraft/world/entity/Entity;ZZ)V"))
////	private static <E extends Entity & Leashable> void init1(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal("if (!p_entity.isAlive() || !leashable$leashdata.leashHolder.isAlive()) {"));
////	}
////
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;handleLeashAtDistance(Lnet/minecraft/world/entity/Entity;F)Z"))
////	private static <E extends Entity & Leashable> void init2(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal("if (!((Leashable)p_entity).handleLeashAtDistance(entity, f)) {"));
////	}
//
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;leashTooFarBehaviour()V"))
////	private static <E extends Entity & Leashable> void init3(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal("f > 10.0"));
////	}
////
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;elasticRangeLeashBehaviour(Lnet/minecraft/world/entity/Entity;F)V"))
////	private static <E extends Entity & Leashable> void init4(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal("f > 6.0"));
////	}
////
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;closeRangeLeashBehaviour(Lnet/minecraft/world/entity/Entity;)V"))
////	private static <E extends Entity & Leashable> void init5(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal("f > 0"));
////	}
//
////	@Inject(method = "tickLeash",at = @At(value = "INVOKE", target = ""))
////	private static <E extends Entity & Leashable> void init6(E p_entity, CallbackInfo ci) {
////		p_entity.sendSystemMessage(Component.literal(""));
////	}
//}