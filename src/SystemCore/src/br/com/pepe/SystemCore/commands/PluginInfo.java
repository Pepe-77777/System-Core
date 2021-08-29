package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class PluginInfo {

	public static void plugininfo (Player p) {
		p.sendMessage(ChatColor.GOLD + "Discord do criador: " + ChatColor.RED + "Pepê#7777, yPepê#7252");
		p.sendMessage(ChatColor.GOLD + "Criador: " + ChatColor.RED + "Pepe_Java");
		p.sendMessage(ChatColor.GOLD + "Github: " + ChatColor.RED + "https://github.com/Pepe-77777/system-core");
	}
	
}
