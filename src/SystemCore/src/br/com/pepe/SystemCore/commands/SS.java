package br.com.pepe.SystemCore.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class SS {

    @SuppressWarnings("deprecation")
	public static void ss (Player p, String[] args) {
  
    	if (!p.hasPermission(Main.plugin.getConfig().getString("ss-permission"))) {
    		p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você não tem permissão!");
    	} else {
    		
    		if (args.length == 0) {
    			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Este nickname não é valido!");
    		} else {
    			Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tp " + args[0] + " " + Main.plugin.getSS());
    			Bukkit.getPlayerExact(args[0]).sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Você foi puxado para SS! Um staff vai dizer para você o que você tem que fazer.");
    			Bukkit.getPlayerExact(args[0]).sendTitle(ChatColor.RED + "Você foi puxado para SS!", ChatColor.YELLOW + "Por favor olhe o chat!");
    			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você puxou " + ChatColor.RED + args[0] + ChatColor.GOLD + " para SS!");
    		}
    	
		
    	}
    	
    }
	
}
