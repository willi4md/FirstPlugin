package me.matthew.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.*;

public class Main extends JavaPlugin implements Listener{

	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage(p.getName() + " Welcome!");
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage(p.getName() + " Has left!");
	}
	
	@EventHandler
	public void testingPlayer(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		//Constructor for Potion Effect (PotionEffectType, Int Duration, Int Amplifier)
		PotionEffect healthBoost = new PotionEffect(PotionEffectType.HEALTH_BOOST, 100, 2);
		PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 100, 2);
				
		//Instantiates an array list for potions
		ArrayList potions = new ArrayList();
		//adds the created potion effect to the array list
		potions.add(healthBoost);
		potions.add(haste);
		//gives the player the designated potion effect
		p.addPotionEffects(potions);
	}
	
}
