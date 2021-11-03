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

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Disabling CCP by ItsMY_");
    }
}
