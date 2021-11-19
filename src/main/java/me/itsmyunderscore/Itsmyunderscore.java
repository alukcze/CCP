/*
 * Copyright (c) 2021. ItsMY_
 * All Rights Reserved
 * You are not allowed to use, distribute or modify this code without written agreement from the author.
 */

package me.itsmyunderscore;

import me.itsmyunderscore.commands.uuid;
import me.itsmyunderscore.commands.whoIs;
import me.itsmyunderscore.events.onCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Itsmyunderscore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        try {
            System.out.println("Starting CCP by ItsMY_");
        } catch (Exception e) {
            throw new RuntimeException("CCP - Error#01 - contact developer with this code");
        }
        getServer().getPluginManager().registerEvents(new onCommand(), this);
        this.getCommand("whoisgay").setExecutor(new whoIs());
        this.getCommand("getuuid").setExecutor(new uuid());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Disabling CCP by ItsMY_");
    }
}
