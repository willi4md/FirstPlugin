package pluginJoinEvent;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new GiveItems(), this);
		getCommand("kit").setExecutor(new CommandKit());
		getCommand("kits").setExecutor(new CommandKits());
	}
}
