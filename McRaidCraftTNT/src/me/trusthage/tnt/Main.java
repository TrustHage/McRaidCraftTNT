     package me.trusthage.tnt;
     
     import java.util.logging.Logger;
     import org.bukkit.plugin.PluginDescriptionFile;
     
     public class Main extends org.bukkit.plugin.java.JavaPlugin
     {
       public static Main plugin;
       
       public void onEnable()
       {
       plugin = this;
         
       PluginDescriptionFile pdfFile = getDescription();
       Logger logger = Logger.getLogger("Minecraft");
         
       getConfig().options().copyDefaults(true);
       saveConfig();
       logger.info("===================================");
       logger.info("|   " + pdfFile.getName() + " by TrustHage" + "   |");
       logger.info("|           Version " + pdfFile.getVersion() + "           |");
       logger.info("|          Stable Version         |");
       logger.info("===================================");
       getCommand("regen").setExecutor(new RegenCommand());
       getCommand("fury").setExecutor(new FuryCommand());
       getCommand("rage").setExecutor(new RageCommand());
       getCommand("tnt").setExecutor(new TNTCommand());
       getCommand("tntreload").setExecutor(new ConfigReload());
       }
       
       public void onDisable() {
       PluginDescriptionFile pdfFile = getDescription();
       Logger logger = Logger.getLogger("Minecraft");
         
       logger.info(pdfFile.getName() + "V" + pdfFile.getVersion() + " has been disabled!");
       }
     }

