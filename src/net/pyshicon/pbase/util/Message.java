package net.pyshicon.pbase.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message {

    public static void send(Player p, String m) {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', m));
    }

    public static void send(CommandSender s, String m) {
        s.sendMessage(ChatColor.translateAlternateColorCodes('&', m));
    }

    public static void sendConsole(String m) {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', m));
    }

    public static void broadcast(String m, boolean silent) {
        if (silent == false) {
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', m));
        } else {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', m));
            }
        }
    }
}
