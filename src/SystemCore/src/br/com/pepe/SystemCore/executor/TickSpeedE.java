package br.com.pepe.SystemCore.executor;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.Main;
import net.md_5.bungee.api.ChatColor;

public class TickSpeedE implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		
		if(!(sender instanceof Player)) {
			return true;
		}
		
		Player p = (Player)sender;
		tickspeed(p, args);
		return false;
	}
	
	public static void tickspeed (Player p, String[] args) {
		
		if(!p.hasPermission(Main.plugin.getConfig().getString("tickspeed-p"))) {
			
			p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você não tem permissão.");
			
		} else {
			
			if(args.length == 0) {
				p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Você precisa botar o TickSpeed! [default: 3]");
			} else {
			
			if(args != null) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamerule randomTickSpeed " + args[0]);
				p.sendMessage(Main.plugin.getPrefix() + ChatColor.GOLD + "Tick Speed alterado para " + args[0] + " com sucesso!");
			}
			
			}
			
		}

	}
	
	
}
