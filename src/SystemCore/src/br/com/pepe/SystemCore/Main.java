package br.com.pepe.SystemCore;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.pepe.SystemCore.events.Events;
import br.com.pepe.SystemCore.executor.*;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
    FileConfiguration config = getConfig();
	public static Main plugin;
	public String prefix = ChatColor.AQUA + "" + ChatColor.BOLD + "System Core" + ChatColor.GRAY + ChatColor.BOLD + " -> " + ChatColor.RESET;
	public String SS;
	public boolean toggled2;
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.DARK_GRAY + "Plugin iniciado.");
		plugin = this;
		
        config.addDefault("raio-permission", "SystemCore.Raio");
        config.options().copyDefaults(true);
        
        config.addDefault("tickspeed-permission", "SystemCore.TickSpeed");
        config.options().copyDefaults(true);
        
        config.addDefault("fly-permission", "SystemCore.Fly");
        config.options().copyDefaults(true);
        
        config.addDefault("fly-world", "Lobby");
        config.options().copyDefaults(true);
        
        config.addDefault("ban-permission", "SystemCore.Ban");
        config.options().copyDefaults(true);
        
        config.addDefault("ss-permission", "SystemCore.SS");
        config.options().copyDefaults(true);
       
        saveConfig();
        
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
		getCommand("TickSpeed").setExecutor(new TickSpeedE());
		getCommand("Fly").setExecutor(new FlyE());
		getCommand("Ban").setExecutor(new BanE());
		getCommand("Unban").setExecutor(new UnbanE());
		getCommand("SS").setExecutor(new SSE());
		getCommand("setSS").setExecutor(new SetSSE());
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public String getSS() {
		return SS;
	}
	
	public void setSS(String a) {
		SS = a;
		
        config.addDefault("ss-position", SS);
        config.options().copyDefaults(true);
        
        saveConfig();
	}
	
	public void set2Toggled(Boolean a) {
		toggled2 = a;
	}
	
	public Boolean get2Toggled() {
		return toggled2;
	}
	
}
