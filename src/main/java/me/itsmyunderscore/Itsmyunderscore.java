/*
 * Copyright (c) 2021. ItsMY_
 * All Rights Reserved
 * You are not allowed to use, distribute or modify this code without written agreement from the author.
 */

package me.itsmyunderscore;

import me.itsmyunderscore.commands.whoIs;
import me.itsmyunderscore.events.onCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Itsmyunderscore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Starting CCP by ItsMY_");
        getServer().getPluginManager().registerEvents(new onCommand(), this);
        this.getCommand("whoisgay").setExecutor(new whoIs());

        SpigotPluginUpdater spu = new SpigotPluginUpdater(this/*Your Plugin*/, "http://www.ccp-plugin.wz.cz/index.html");
        spu.enableOut(); // Enables an Output if there is a new Update and if the file was downloaded
        //spu.disableOut(); Disables the output
        if(spu.needsUpdate()) spu.externalUpdate();// Check if there is an Update available
        //...
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Disabling CCP by ItsMY_");
    }
}
