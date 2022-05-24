package com.zittla.languages.config;

public interface Configuration {

  String getString(String path);

  String getString(String path, String def);

}
