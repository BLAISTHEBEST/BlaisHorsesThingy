/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blaisthebest.horses;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author is BLAISTEBEST. Hello there random person whos looking at the source code!
 */
public class main extends JavaPlugin implements Listener  {

  

   
   @Override
   public void onEnable() {
       
       //if(!getDataFolder().exists()) Just in case I want to use a config
         //   getDataFolder().mkdir();
       //final FileConfiguration config = this.getConfig();
   CustomEntities.registerEntities();

        //this.saveDefaultConfig();
       
                  this.getCommand("horse").setExecutor(new HorseCommand(this));
                  
             
Bukkit.getPluginManager().registerEvents(new ChatListener(this), this);

   }   
   
   @Override
   public void onDisable(){
       CustomEntities.unregisterEntities();
       
   }
   
   
        
        }
   

      

       
