     package me.trusthage.tnt;
     
     import org.bukkit.ChatColor;
     import org.bukkit.command.Command;
     import org.bukkit.command.CommandExecutor;
     import org.bukkit.command.CommandSender;
     import org.bukkit.entity.Player;
     
     
     public class ConfigReload
       implements CommandExecutor
     {
       public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3)
       {
       if (!(arg0 instanceof Player))
         {
         return false;
         }
         
       Player player = (Player)arg0;
       if (player.hasPermission("mcraidcraft.reload"))
         {
     
         Main.plugin.reloadConfig();
         player.sendMessage(ChatColor.GREEN + "The config file has been reloaded!");
         }
       return false;
       }
     }
