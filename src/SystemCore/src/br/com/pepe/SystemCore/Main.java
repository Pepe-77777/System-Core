package br.com.pepe.SystemCore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.pepe.SystemCore.events.Events;
import br.com.pepe.SystemCore.executor.SystemCoreE;
import br.com.pepe.SystemCore.executor.UptimeE;
import br.com.pepe.SystemCore.executor.PingE;
import br.com.pepe.SystemCore.executor.PluginInfoE;
import br.com.pepe.SystemCore.executor.RaioE;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	public String prefix = ChatColor.AQUA + "" + ChatColor.BOLD + "System Core" + ChatColor.GRAY + ChatColor.BOLD + " -> " + ChatColor.RESET;
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.DARK_GRAY + "Plugin iniciado.");
		plugin = this;
		
		registerEvents();
		registerCommands();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.DARK_GRAY + "Plugin desligado.");
		
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Events(), this);
	}
	
	public void registerCommands() {
		getCommand("SystemCore").setExecutor(new SystemCoreE());
		getCommand("PluginInfo").setExecutor(new PluginInfoE());
		getCommand("Raio").setExecutor(new RaioE());
		getCommand("Uptime").setExecutor(new UptimeE());
		getCommand("Ping").setExecutor(new PingE());
	}
	
	public String getPrefix() {
		return prefix;
	}
	
}
