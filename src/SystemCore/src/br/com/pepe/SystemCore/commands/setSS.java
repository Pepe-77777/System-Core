package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class setSS {

    public static void setss (Player p) {
  
    	if (!p.hasPermission(Main.plugin.getConfig().getString("ss-permission"))) {
    		p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Voc� n�o tem permiss�o!");
    	} else {
    		
    		Main.plugin.setSS(p.getLocation().getX() + " " + p.getLocation().getBlockY() + " " + p.getLocation().getBlockZ());
    		
    		p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Voc� setou a jaula com sucesso! (" + p.getLocation().getX() + " " + p.getLocation().getBlockY() + " " + p.getLocation().getBlockZ() + ")");
    		
    	}
		
	}
	
}
