package br.com.pepe.SystemCore.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class Ban {

	public static void ban (Player p, String[] args) {
		
		// Verificar se o player não tem a permissão de banir
		if (!p.hasPermission(Main.plugin.getConfig().getString("ban-permission")) || !p.hasPermission("minecraft.command.ban")) {
			// Mandar a mensagem de que não tem permissão
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você não tem a permissão para banir!");
			
			// Se não (se tiver a permissão)
		} else {
			// Verificar se ele botou um player com mais de 3 caracteres
			if (args.length <= 3) {
				p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você precisa botar um nick valido!");
			}
			
			if (args[0].length() >= 3 & args[1] != null) {
				// Banir
				Bukkit.broadcastMessage(ChatColor.AQUA + "O player " + ChatColor.RED + Bukkit.getPlayer(args[0]).getName() + ChatColor.AQUA + " Foi banido!");
				Bukkit.getPlayer(args[0]).kickPlayer(ChatColor.RED + "Você foi banido permanentemente!\nMotivo: " + args[1]);
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "minecraft:ban " + args[0] + " " + ChatColor.RED + args[1]);
			}
			
		}
		
	}
		
}
