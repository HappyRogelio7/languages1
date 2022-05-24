package com.zittla.languages;

import com.zittla.languages.service.Service;
import java.util.Set;
import javax.inject.Inject;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import team.unnamed.inject.Injector;

@SuppressWarnings("unused")
public class LanguagePlugin extends JavaPlugin {

  @Inject private Set<Service> services;
  @Inject private Set<Listener> listeners;

  public LanguagePlugin() {
    Injector.create()
        .injectMembers(this);
  }

  @Override
  public void onEnable() {
    services.forEach(Service::start);
    listeners.forEach(listener -> getServer().getPluginManager().registerEvents(listener, this));
  }

  @Override
  public void onDisable() {
    services.forEach(Service::stop);
  }

}
