package me.mchiappinam.pdghlogarcmd;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Listeners implements Listener {

	//private Main plugin;
	public Listeners(Main main) {
		//plugin=main;
	}
	
	@EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
	public void onCmd(PlayerCommandPreprocessEvent e) {
		if(e.getMessage().toLowerCase().startsWith("/logar")) {
			e.setMessage(e.getMessage().replaceFirst("/logar", "/login"));
			return;
		}else if(e.getMessage().toLowerCase().startsWith("/registrar")) {
			e.setMessage(e.getMessage().replaceFirst("/registrar", "/register"));
			return;
		}
	}
}
