/*
 * Copyright (c) 2021. ItsMY_
 * All Rights Reserved
 * You are not allowed to use, distribute or modify this code without written agreement from the author.
 */

package me.itsmyunderscore.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.UUID;


public class onCommand implements Listener {



    @EventHandler
    public void PlayerCommandSendEvent(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();

        if (event.getMessage().startsWith("/msg")) {
        }
        else if (event.getMessage().startsWith("/uuid")) {
        }
        else {

            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendMessage(player.getName() + " just issued this command: " + event.getMessage());
            }
        }


    }
}
