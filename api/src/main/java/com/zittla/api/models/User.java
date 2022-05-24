package com.zittla.api.models;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public interface User {

  @NotNull UUID getId();

  @NotNull String getLanguage();

  void setLanguage(@NotNull String language);

}
