package com.shenzhou_mafuyu33.chainedtogether.item;

import com.shenzhou_mafuyu33.chainedtogether.ChainedTogetherMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChainedTogetherMod.MODID);

    public static final DeferredItem<Item> ChainedTogetherItem = ITEMS.register("chainedtogetheritem",()->
            new ChainedTogetherItem(new Item.Properties().stacksTo(1)));
}

