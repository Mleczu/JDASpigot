package com.github.mleczu.jdaspigot;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.concurrent.TimeUnit;

public class BungeeLoader extends Plugin {
    @Override
    public void onEnable() {
        ProxyServer.getInstance().getScheduler().schedule(this, () -> BungeeLoader.this.getLogger().info("This build included: " + Version.JDAVersion),  100L, TimeUnit.MILLISECONDS);
    }
}
