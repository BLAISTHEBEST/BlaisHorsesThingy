import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class HorseCommand implements CommandExecutor{
    
           	private final HorseCommand plugin;
 
	public HorseCommand(HorseCommand plugin) {
		this.plugin = plugin; 
	}
         
         
         
                   @Override
       public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
           if (sender.hasPermission("RolePlay.JoinChannel")) {
      
               sender.sendMessage(ChatColor.GREEN + "You left the Roleplay channel!");
           }else{
           String cmdsender = sender.getName();
theEntityHorse.spawnEntity(new CustomHorse(Bukkit.getWorld("world")), new Location(Bukkit.getWorld("world"), 100, 100, 100));
        sender.sendMessage(ChatColor.GREEN + "You joined the Roleplay channel!");
        
    
}
           


       return true;
       }
}