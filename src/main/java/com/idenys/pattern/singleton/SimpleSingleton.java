package com.idenys.pattern.singleton;

/** The simplest singleton NOT thread-safe implementation. */
public class SimpleSingleton {

  private static SimpleSingleton INSTANCE;

  private SimpleSingleton() {}

  public static SimpleSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new SimpleSingleton();
    }
    return INSTANCE;
  }
}
