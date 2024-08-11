package com.shenzhou_mafuyu33.chainedtogether;


import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChainManager {
    private static List<Pair<UUID, UUID>> chainedPlayers;

    public ChainManager() {
        chainedPlayers = new ArrayList<>();
    }

    // Method to add a pair of players to the chained list
    public static void addChainedPlayers(UUID player1, UUID player2) {
        Pair<UUID, UUID> pair = Pair.of(player1, player2);
        if (!chainedPlayers.contains(pair)) {
            chainedPlayers.add(pair);
        }
    }

    // Method to remove a pair of players from the chained list
    public static void removeChainedPlayers(UUID player1, UUID player2) {
        Pair<UUID, UUID> pair = Pair.of(player1, player2);
        chainedPlayers.remove(pair);
    }

    // Method to get the list of all chained pairs
    public static List<Pair<UUID, UUID>> getChainedPlayers() {
        return new ArrayList<>(chainedPlayers);
    }

    // Method to check if a player is in any pair
    //如果自己没有被chained的时候，才可以和别人连接。
    public static boolean isChained(UUID player) {
        for (Pair<UUID, UUID> pair : chainedPlayers) {
            if (pair.getLeft().equals(player) || pair.getRight().equals(player)) {
                return true;
            }
        }
        return false;
    }
}
