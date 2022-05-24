package com.zittla.languages.service;

public interface Service {

  void start();

  default void stop() {
    // do nothing
  }

}
