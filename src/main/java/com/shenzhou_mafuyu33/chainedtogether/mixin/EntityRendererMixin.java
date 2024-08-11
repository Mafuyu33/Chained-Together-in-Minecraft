//package com.mafuyu33.chainedtogether.mixin;
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import net.minecraft.client.renderer.MultiBufferSource;
//import net.minecraft.client.renderer.entity.EntityRenderer;
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.entity.Entity;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Mixin(EntityRenderer.class)
//public abstract class EntityRendererMixin<T extends Entity> {
//
//    @Inject(method = "render",at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/EntityRenderer;renderLeash(Lnet/minecraft/world/entity/Entity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/world/entity/Entity;)V"))
//	private void init(T p_entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, CallbackInfo ci) {
//        p_entity.sendSystemMessage(Component.literal("renderLeash"));
//	}
////    @Inject(method = "render",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Leashable;getLeashHolder()Lnet/minecraft/world/entity/Entity;"))
////	private void init1(T p_entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, CallbackInfo ci) {
////        p_entity.sendSystemMessage(Component.literal("(p_entity instanceof Leashable leashable)"));
////	}
////    @Inject(method = "render",at = @At(value = "HEAD"))
////	private void init2(T p_entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, CallbackInfo ci) {
////        p_entity.sendSystemMessage(Component.literal("render"));
////	}
//
//}