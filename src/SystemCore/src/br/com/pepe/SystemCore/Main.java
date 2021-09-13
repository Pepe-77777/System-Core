package br.com.pepe.SystemCore;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.pepe.SystemCore.events.Events;
import br.com.pepe.SystemCore.executor.SystemCoreE;
import br.com.pepe.SystemCore.executor.TickSpeedE;
import br.com.pepe.SystemCore.executor.UptimeE;
import br.com.pepe.SystemCore.executor.FlyE;
import br.com.pepe.SystemCore.executor.PingE;
import br.com.pepe.SystemCore.executor.PluginInfoE;
import br.com.pepe.SystemCore.executor.RaioE;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
    FileConfiguration config = getConfig();
	public static Main plugin;
	public String prefix = ChatColor.AQUA + "" + ChatColor.BOLD + "System Core" + ChatColor.GRAY + ChatColor.BOLD + " -> " + ChatColor.RESET;
	public boolean toggled;
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
       
        saveConfig();
        
        toggled = false;
        toggled2 = false;
        
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
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public Boolean getToggled() {
		return toggled;
	}
	
	public void setToggled(Boolean a) {
		toggled = a;
	}
	
	public void set2Toggled(Boolean a) {
		toggled2 = a;
	}
	
	public Boolean get2Toggled() {
		return toggled2;
	}
	
}
