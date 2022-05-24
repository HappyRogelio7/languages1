package com.zittla.languages.command.internal;

import javax.inject.Inject;
import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.SubCommandInstanceCreator;
import team.unnamed.inject.Injector;

public class CustomCommandInstanceCreator implements SubCommandInstanceCreator {

  @Inject
  private Injector injector;

  @Override
  public CommandClass createInstance(Class<? extends CommandClass> aClass, CommandClass commandClass) {
    return injector.getInstance(aClass);
  }

  public Injector getInjector() {
    return injector;
  }

}
