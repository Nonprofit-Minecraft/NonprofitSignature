package org.nonprofit_minecraft.signature.bungee;

import org.bstats.bungeecord.Metrics;

import net.md_5.bungee.api.plugin.Plugin;

public class BungeePlugin extends Plugin {
    @Override
    public void onEnable() {
        new Metrics(this);
    }
    
    @Override
    public void onDisable() {
        
    }
}
