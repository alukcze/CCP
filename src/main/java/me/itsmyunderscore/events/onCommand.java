package me.itsmyunderscore.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;


public class onCommand implements Listener {

    @EventHandler
    public void PlayerCommandSendEvent(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();

        if (event.getMessage().startsWith("/msg")) return;
        else {

            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendMessage(player.getName() + " just issued this command: " + event.getMessage());
            }
        }


    }
}
