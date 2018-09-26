package pluginJoinEvent;

import org.bukkit.Material;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.ChatColor;

public class GiveItems implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player user = e.getPlayer();
		
		//checks if this is the players first time on the server
		if (!(user.hasPlayedBefore())) {
			ItemStack food = new ItemStack(Material.GRILLED_PORK);
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			ItemStack protection = new ItemStack(Material.DIAMOND_CHESTPLATE);
			
			//adds the food, sword, and puts the chestplate on the player
			user.getInventory().addItem(food, sword);
			user.getInventory().setChestplate(protection);
			
			//informs the player of their joining gift
			user.sendMessage(ChatColor.BLUE + "Welcome to the server! You've been equipped with a survival kit!");
		}
		
		
	}

}
