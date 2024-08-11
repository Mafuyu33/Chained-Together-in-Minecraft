package com.shenzhou_mafuyu33.chainedtogether.event;

import com.shenzhou_mafuyu33.chainedtogether.ChainedTogetherMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(modid = ChainedTogetherMod.MODID)
public class tickEvent {
    @SubscribeEvent public static void ServerTickEvent(ServerTickEvent.Pre event){

    }
}
