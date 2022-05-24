package com.zittla.languages.config;

import org.bukkit.configuration.file.YamlConfiguration;

public class BukkitConfiguration implements Configuration {

  private final YamlConfiguration configuration;

  public BukkitConfiguration(YamlConfiguration configuration) {
    this.configuration = configuration;
  }

  @Override
  public String getString(String path) {
    return configuration.getString(path);
  }

  @Override
  public String getString(String path, String def) {
    return configuration.getString(path, def);
  }

}
