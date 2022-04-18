package com.github.mleczu.jdaspigot;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;

public class VelocityLoader {
    private final Logger logger;
    private final ProxyServer server;

    @Inject
    public VelocityLoader(ProxyServer server, Logger logger) {
        this.logger = logger;
        this.server = server;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        server.getScheduler().buildTask(this, () -> VelocityLoader.this.logger.info("This build included: " + Version.JDAVersion)).delay(100L, TimeUnit.MILLISECONDS).schedule();
    }
}
