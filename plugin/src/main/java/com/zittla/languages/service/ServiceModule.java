package com.zittla.languages.service;

import com.zittla.languages.command.CommandService;
import team.unnamed.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

  @Override
  protected void configure() {
    multibind(Service.class)
        .asSet()
        .to(CommandService.class)
        .singleton();
  }

}
