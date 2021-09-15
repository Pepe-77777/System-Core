package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class Fly {

	public static void fly (Player p) {
		
		// Verificar se o player tem a permiss�o que est� no config.yml
		if (!p.hasPermission(Main.plugin.getConfig().getString("fly-permission"))) { 
			// Mandando a mensagem System-Core -> Voc� n�o tem permiss�o! (mensagem de quando n�o tem permiss�o)
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Voc� n�o tem permiss�o!");
		} else if(!p.getWorld().getName().equals(Main.plugin.getConfig().getString("fly-world"))) {
			if(!p.hasPermission(Main.plugin.getConfig().getString("fly-permission") + ".bypass")) {
				p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Voc� n�o tem permiss�o de ativar o FLY neste mundo.");
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
