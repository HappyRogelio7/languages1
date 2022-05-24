package com.zittla.languages.command;

import com.zittla.languages.command.internal.CustomCommandInstanceCreator;
import com.zittla.languages.commands.LangCommand;
import com.zittla.languages.service.Service;
import javax.inject.Inject;
import me.fixeddev.commandflow.CommandManager;
import me.fixeddev.commandflow.annotated.AnnotatedCommandTreeBuilder;
import me.fixeddev.commandflow.annotated.AnnotatedCommandTreeBuilderImpl;
import me.fixeddev.commandflow.annotated.builder.AnnotatedCommandBuilder;
import me.fixeddev.commandflow.annotated.part.PartInjector;
import me.fixeddev.commandflow.annotated.part.defaults.DefaultsModule;
import me.fixeddev.commandflow.bukkit.BukkitCommandManager;

public class CommandService implements Service {

  private final CommandManager commandManager;
  @Inject
  private CustomCommandInstanceCreator instanceCreator;

  public CommandService() {
    commandManager = new BukkitCommandManager("languages");
  }

  @Override
  public void start() {
    PartInjector partInjector = PartInjector.create();
    partInjector.install(new DefaultsModule());

    AnnotatedCommandTreeBuilder annotatedCommandTreeBuilder = new AnnotatedCommandTreeBuilderImpl(
        AnnotatedCommandBuilder.create(partInjector), instanceCreator);

    commandManager.registerCommands(
        annotatedCommandTreeBuilder.fromClass(
            instanceCreator
                .getInjector()
                .getInstance(LangCommand.class)
        )
    );
  }

  @Override
  public void stop() {
    commandManager.unregisterAll();
  }

}
