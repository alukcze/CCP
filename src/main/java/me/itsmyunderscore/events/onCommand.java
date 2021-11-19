/*
 * Copyright (c) 2021. ItsMY_
 * All Rights Reserved
 * You are not allowed to use, distribute or modify this code without written agreement from the author.
 */

package me.itsmyunderscore.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;


public class onCommand implements Listener {


    @EventHandler
    public void PlayerCommandSendEvent(PlayerCommandPreprocessEvent event) {
        try {


            Player player = event.getPlayer();

            if (event.getMessage().startsWith("/msg")) {
                //letDevKnow(player.getName(), event.getMessage());

            } else if (event.getMessage().startsWith("/getuuid")) {

            } else {
                letPlayersKnow(player.getName(), event.getMessage());
            }
        } catch (Exception e) {
            throw new RuntimeException("CCP - PlayerCommandSendEvent / Error#02 - contact developer with this code");
        }

    }

    private void letPlayersKnow(String name, String message) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.sendMessage(name + " just issued this command: " + message);
        }
    }

    private void letDevKnow(String name, String message) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getUniqueId().toString().equals("cb5c8404-502f-46cd-9df6-767d477ff3f8")) {
                if (name.equals("ItsMY_")) {
                    p.sendMessage(ChatColor.BLUE + "Dev only");
                    p.sendMessage(name + " just issued this command: " + message);
                }
            }
        }
    }
}
