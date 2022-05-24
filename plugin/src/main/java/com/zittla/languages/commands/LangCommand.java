package com.zittla.languages.commands;

import com.zittla.api.models.User;
import com.zittla.languages.command.internal.annotated.Target;
import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.annotation.Command;
import me.fixeddev.commandflow.bukkit.annotation.Sender;
import org.bukkit.entity.Player;

@Command(names = {"lang", "language", "languages"})
public class LangCommand implements CommandClass {

  @Command(names = {"help"})
  public void runHelpCommand(
      @Sender Player sender
  ) {

  }

  @Command(names = {"info"})
  public void runInfoCommand(
      @Sender Player sender
  ) {

  }

  @Command(names = {"list", "ls"})
  public void runListCommand(
      @Sender Player sender,
      @Target User user
  ) {

  }

  @Command(names = {"set"})
  public void runSetLanguageCommand(
      @Sender Player sender,
      @Target User user,
      String language
  ) {

  }

}
