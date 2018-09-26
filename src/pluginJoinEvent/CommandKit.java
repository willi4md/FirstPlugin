package pluginJoinEvent;

import org.bukkit.Material;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.ChatColor;

public class CommandKit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {

			Player user = (Player) sender;

			// item stack for starter kits
			ItemStack starterFood = new ItemStack(Material.APPLE);
			ItemStack starterChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemStack starterBoots = new ItemStack(Material.LEATHER_BOOTS);

			// item stack for intermediate kits
			ItemStack interFood = new ItemStack(Material.GOLDEN_APPLE);
			ItemStack interChest = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack interBoots = new ItemStack(Material.IRON_BOOTS);

			// item stack for advanced kits
			ItemStack advancedFood = new ItemStack(Material.GRILLED_PORK);
			ItemStack advancedChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemStack advancedBoots = new ItemStack(Material.DIAMOND_BOOTS);

			if (args.length == 1) {

				switch (args[0]) {

				case "starter":
					user.getInventory().addItem(starterFood);
					user.getInventory().setChestplate(starterChestplate);
					user.getInventory().setBoots(starterBoots);
					user.sendMessage("You've received the starter kit");
					break;

				case "intermediate":
					user.getInventory().addItem(interFood);
					user.getInventory().setChestplate(interChest);
					user.getInventory().setBoots(interBoots);
					user.sendMessage("You've received the intermediate kit");
					break;

				case "advanced":
					user.getInventory().addItem(advancedFood);
					user.getInventory().setChestplate(advancedChest);
					user.getInventory().setBoots(advancedBoots);
					user.sendMessage("You've received the advanced kit");
					break;
					
				default:
					user.sendMessage(ChatColor.RED + "NOT A VALID KIT RETARD!");
					break;

				}
			} 
			
			if (args.length > 1) {
				user.sendMessage(ChatColor.RED + "NOT A VALID KIT RETARD!");
			}

		}

		return true;
	}

}
