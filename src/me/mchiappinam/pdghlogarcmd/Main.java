package me.mchiappinam.pdghlogarcmd;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2iniciando...");
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2registrando eventos...");
		getServer().getPluginManager().registerEvents(new Listeners(this), this);
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2eventos registrados");
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2ativado - Developed by mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2Acesse: http://pdgh.com.br/");
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2Acesse: https://hostload.com.br/");
	}
	    
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2desativado - Developed by mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2Acesse: http://pdgh.com.br/");
		getServer().getConsoleSender().sendMessage("§3[PDGHLogarCMD] §2Acesse: https://hostload.com.br/");
	}
}
