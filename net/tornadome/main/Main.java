package net.tornadome.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
@Override
public void onEnable() {
	getLogger().info("FakeOP has started - Coded by Tornadome_v4");
}
	
	
public boolean onCommand(CommandSender sender, Command command, String Label, String[] args){
	if(command.getName().equalsIgnoreCase("fakeop") && sender.hasPermission("fakeop.ain"));
		if (args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Please specify a player!");
			return true;
			
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null) {
			sender.sendMessage(ChatColor.RED + "Could not find specified player.");
		}
		target.sendMessage(ChatColor.GRAY + "[Server: Opped " + args[0]);
				target.sendMessage(ChatColor.YELLOW + "You are now OP!");
				return false;
				
			
			
		}
}
