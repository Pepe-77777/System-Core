package br.com.pepe.SystemCore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {
	
	@EventHandler
	public void aoEntrar(PlayerJoinEvent e) {
		e.setJoinMessage(null);	
	}
	
	@EventHandler
	public void aoSair(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}
	
}
