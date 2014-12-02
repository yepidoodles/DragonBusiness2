package me.Magnusri.DragonBusiness2.commands;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CmdExecutor {
	
	//Prepare Commands
	Help help;
	
	public CmdExecutor(Plugin plugin, Player player, Command cmd, String[] args){
		
		
		if (args.length != 0){
			switch (args[0]){
			case "help":
				//Instantiate command
				help = new Help(plugin, player);
				help.execute();
				break;
			case "default":
				//Instantiate command
				help = new Help(plugin, player);
				help.execute();
				break;
			}
		} else {
			//Instantiate command
			help = new Help(plugin, player);
			help.execute();
		}
	}
}