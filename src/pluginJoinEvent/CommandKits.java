package pluginJoinEvent;

import org.bukkit.command.Command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class CommandKits implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player)

		{
			Player user = (Player) sender;
			user.sendMessage(ChatColor.BOLD.YELLOW + "Available Kits:");
			user.sendMessage(ChatColor.GREEN + "Starter");
			user.sendMessage(ChatColor.GREEN + "Intermediate");
			user.sendMessage(ChatColor.GREEN + "Advanced");
		}
		return true;
	}

}
