package br.com.pepe.SystemCore.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class Unban {

	public static void unban (Player p, String[] args) {
		
		// Verificar se o player n�o tem a permiss�o de banir
		if (!p.hasPermission(Main.plugin.getConfig().getString("ban-permission") + ".unban") || !p.hasPermission("minecraft.command.pardon")) {
			// Mandar a mensagem de que n�o tem permiss�o
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Voc� n�o tem a permiss�o para desbanir!");
			
			// Se n�o (se tiver a permiss�o)
		} else {
			// Verificar se ele botou um player com mais de 3 caracteres
			if (args.length <= 3) {
				p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Voc� precisa botar um nick valido!");
			}
			
			if (args[0].length() >= 3) {
				// Desbanir
				Bukkit.broadcastMessage(ChatColor.AQUA + "O player " + ChatColor.RED + Bukkit.getPlayer(args[0]).getName() + ChatColor.AQUA + " Foi desbanido!");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "minecraft:pardon " + args[0]);
			}
			
		}
		
	}
		
}
