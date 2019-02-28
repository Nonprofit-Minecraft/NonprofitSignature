package org.nonprofit_minecraft.signature.bukkit;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        new Metrics(this);
    }
    
    @Override
    public void onDisable() {
        
    }
}
