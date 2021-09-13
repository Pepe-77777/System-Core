package br.com.pepe.SystemCore.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class Raio {

    public static void raio (Player p) {
  
		if(p.hasPermission(Main.plugin.getConfig().getString("raio-permission"))) {
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "execute " + p.getName() + " ~ ~ ~ /summon LightningBolt");
		p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você spawnou o " + ChatColor.RED + "RAIO" + ChatColor.GOLD + "!");
		} else {
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você não tem permissão para executar este comando.");
		}
	}
	
}
