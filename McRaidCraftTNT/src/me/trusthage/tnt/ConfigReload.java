/*    */ package me.trusthage.tnt;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class ConfigReload
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3)
/*    */   {
/* 15 */     if (!(arg0 instanceof Player))
/*    */     {
/* 17 */       return false;
/*    */     }
/*    */     
/* 20 */     Player player = (Player)arg0;
/* 21 */     if (player.hasPermission("mcraidcraft.reload"))
/*    */     {
/*    */ 
/* 24 */       Main.plugin.reloadConfig();
/* 25 */       player.sendMessage(ChatColor.GREEN + "The config file has been reloaded!");
/*    */     }
/* 27 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\GamePC Mick\Desktop\McRaidCraft Spigot 2\plugins\McRaidCraftTNT.jar!\me\trusthage\tnt\ConfigReload.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */