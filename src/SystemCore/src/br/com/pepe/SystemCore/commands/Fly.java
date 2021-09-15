package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class Fly {

	public static void fly (Player p) {
		
		// Verificar se o player tem a permissão que está no config.yml
		if (!p.hasPermission(Main.plugin.getConfig().getString("fly-permission"))) { 
			// Mandando a mensagem System-Core -> Você não tem permissão! (mensagem de quando não tem permissão)
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você não tem permissão!");
		} else if(!p.getWorld().getName().equals(Main.plugin.getConfig().getString("fly-world"))) {
			if(!p.hasPermission(Main.plugin.getConfig().getString("fly-permission") + ".bypass")) {
				p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você não tem permissão de ativar o FLY neste mundo.");
				p.setAllowFlight(false);
				p.setFlying(false);
		} else {
				p.setAllowFlight(! p.getAllowFlight());
				p.setFlying(p.getAllowFlight());
				
				IFfly(p);
			}
		
			} else {
				p.setAllowFlight(! p.getAllowFlight());
				p.setFlying(p.getAllowFlight());
				
				IFfly(p);
		}
		
	}
	
	public static void IFfly(Player p) {
		if(p.getAllowFlight()) {
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GREEN + "FLY Ativado.");
		} else {
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.DARK_RED + "FLY Desativado.");
		}
	}
		
}
