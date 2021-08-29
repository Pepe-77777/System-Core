package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import me.clip.placeholderapi.PlaceholderAPI;
import net.md_5.bungee.api.ChatColor;

public class Uptime {

	public static void uptime (Player p) {
		String uptime = PlaceholderAPI.setPlaceholders(p, "%server_uptime%");
		p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "O uptime do server é: " + ChatColor.RED + uptime + ChatColor.GOLD + "!");
	}
	
}
