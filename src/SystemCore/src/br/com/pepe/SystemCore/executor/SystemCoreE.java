package br.com.pepe.SystemCore.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.pepe.SystemCore.commands.SystemCore;

public class SystemCoreE implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		
		if(!(sender instanceof Player)) {
			return true;
		}
		
		
		Player p = (Player)sender;
		SystemCore.systemcore(p);
				
		return false;
	}
	
	
}
