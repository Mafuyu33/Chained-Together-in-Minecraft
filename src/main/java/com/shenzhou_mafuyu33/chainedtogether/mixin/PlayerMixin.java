//package com.mafuyu33.chainedtogether.mixin;
//
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.Leashable;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.level.Level;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Unique;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//import javax.annotation.Nullable;
//
//@Mixin(Player.class)
//public abstract class PlayerMixin extends LivingEntity implements Leashable {
//	protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
//		super(entityType, level);
//	}
//
//	@Unique
//	private LeashData chained_Together_in_Minecraft$leashData;
//
//	@Nullable
//	@Override
//	public LeashData getLeashData() {
//		return this.chained_Together_in_Minecraft$leashData;
//	}
//
//	@Override
//	public void setLeashData(@Nullable LeashData leashData) {
//		this.chained_Together_in_Minecraft$leashData = leashData;
//	}
//
//	@Override
//	public boolean handleLeashAtDistance(Entity leashHolder, float distance) {
//		return true;
//	}
//
//	@Override
//	public void leashTooFarBehaviour() {
//		this.dropLeash(true, true);
//	}
//
//	@Override
//	public void elasticRangeLeashBehaviour(Entity leashHolder, float distance) {
//		chained_Together_in_Minecraft$legacyElasticRangeLeashBehaviour((Entity & Leashable)(Object)this, leashHolder, distance);
//	}
//
//	@Unique
//	private static <E extends Entity & Leashable> void chained_Together_in_Minecraft$legacyElasticRangeLeashBehaviour(E entity, Entity leashHolder, float distance) {
//		double d0 = (leashHolder.getX() - entity.getX()) / (double)distance;
//		double d1 = (leashHolder.getY() - entity.getY()) / (double)distance;
//		double d2 = (leashHolder.getZ() - entity.getZ()) / (double)distance;
//		entity.setDeltaMovement(entity.getDeltaMovement().add(Math.copySign(d0 * d0 * 0.4, d0), Math.copySign(d1 * d1 * 0.4, d1), Math.copySign(d2 * d2 * 0.4, d2)));
//	}
//
//	@Override
//	public boolean canBeLeashed() {
//		return true;
//	}
//	@Inject(method = "addAdditionalSaveData", at = @At(value = "TAIL"))
//	private void init(CompoundTag compound, CallbackInfo ci) {
//		this.writeLeashData(compound, this.chained_Together_in_Minecraft$leashData);
//	}
//	@Inject(method = "readAdditionalSaveData", at = @At(value = "TAIL"))
//	private void init2(CompoundTag compound, CallbackInfo ci) {
//		this.chained_Together_in_Minecraft$leashData = this.readLeashData(compound);
//	}
//
////	@Inject(method = "tick", at = @At(value = "TAIL"))
////	private void init(CallbackInfo ci) {
////		if (this.level().isClientSide) {
////			Leashable.tickLeash((Player & Leashable)(Object)this);
////		}
////	}
//}