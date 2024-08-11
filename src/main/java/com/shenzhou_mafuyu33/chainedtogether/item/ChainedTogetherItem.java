package com.shenzhou_mafuyu33.chainedtogether.item;

import com.shenzhou_mafuyu33.chainedtogether.ChainManager;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ChainedTogetherItem extends Item {
    public ChainedTogetherItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
        if(interactionTarget instanceof Player interactedPlayer && !ChainManager.isChained(player.getUUID())){
            ChainManager.addChainedPlayers(player.getUUID(),interactedPlayer.getUUID());
            player.sendSystemMessage(Component.literal("ChainedPlayersAdded"));
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
