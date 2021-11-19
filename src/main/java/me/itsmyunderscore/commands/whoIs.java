/*
 * Copyright (c) 2021. ItsMY_
 * All Rights Reserved
 * You are not allowed to use, distribute or modify this code without written agreement from the author.
 */

package me.itsmyunderscore.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class whoIs implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        try {


            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendMessage("Rimlik69 is gay");
            }

            return false;
        } catch (Exception e) {
            throw new RuntimeException("CCP - PlayerCommandSendEvent / Error#03 - contact developer with this code");
        }
    }
}
