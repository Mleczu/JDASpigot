package com.github.mleczu.jdaspigot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotLoader extends JavaPlugin {
    public void onEnable() {
        Bukkit.getScheduler().runTaskLater((Plugin)this, new Runnable() {
            public void run() {
                SpigotLoader.this.getLogger().info("This build included: " + Version.JDAVersion);
            }
        },  100L);
    }
}
