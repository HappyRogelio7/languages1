package com.zittla.languages.models;

import com.zittla.api.models.User;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class LocalUser implements User {

  private final UUID id;
  private String language;

  public LocalUser(UUID id, String language) {
    this.id = id;
    this.language = language;
  }

  @Override
  public @NotNull UUID getId() {
    return id;
  }

  @Override
  public @NotNull String getLanguage() {
    return language;
  }

  @Override
  public void setLanguage(@NotNull String language) {
    this.language = language;
  }

}
