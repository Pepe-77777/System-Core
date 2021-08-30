package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import me.clip.placeholderapi.PlaceholderAPI;
import net.md_5.bungee.api.ChatColor;

public class Ping {

	public static void ping (Player p) {
		String ping = PlaceholderAPI.setPlaceholders(p, "%player_ping%");
		p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "O seu ping é de: " + ChatColor.RED + ping + ChatColor.GOLD + "!");
	}
	
}
