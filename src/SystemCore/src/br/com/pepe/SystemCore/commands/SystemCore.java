package br.com.pepe.SystemCore.commands;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class SystemCore {

	public static void systemcore (Player p) {
		p.sendMessage(ChatColor.GOLD + "Sej� bem vindo ao " + ChatColor.AQUA + "" + ChatColor.BOLD + "System Core" + ChatColor.RESET + "" + ChatColor.GOLD + "!");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/uptime " + ChatColor.RESET + "" + ChatColor.GOLD + "Vej� o tempo que o server est� on.");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/raio " + ChatColor.RESET + "" + ChatColor.GOLD + "Fa�a um raio cair na sua cabe��. [requer a permiss�o SystemCore.raio]");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/plugininfo " + ChatColor.RESET + "" + ChatColor.GOLD + "Vej� as informa��es do server");
		p.sendMessage(ChatColor.GRAY +""+ ChatColor.ITALIC + "Plugin criado por " + ChatColor.BOLD + "" + ChatColor.RED +""+ ChatColor.ITALIC + "Pepe_Java" + ChatColor.GRAY +""+ ChatColor.ITALIC + ", Pessoas que ajudaram a criar: "+ChatColor.RED+""+ChatColor.ITALIC+"zZHenrique_, e_obraia");
	}
	
}
