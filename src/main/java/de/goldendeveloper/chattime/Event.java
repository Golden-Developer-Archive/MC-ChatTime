package de.goldendeveloper.chattime;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event implements Listener {

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH:mm:ss");
        e.setFormat("§6[§a" + dtf5.format(LocalDateTime.now()) + "§6] §r" + p.getDisplayName() + " » " + e.getMessage());
    }
}
