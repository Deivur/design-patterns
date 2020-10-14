package com.idenys.pattern.singleton;

/**
 * Eagerly instantiated singleton rather than lazy once getInstance() method called. Thread-safe. If
 * your application always creates and uses an instance of the Singleton and the overhead of
 * creation and runtime aspects of the Singleton are not onerous.
 */
public class EagerSingleton {

  private static final EagerSingleton INSTANCE = new EagerSingleton();

  private EagerSingleton() {}

  public static EagerSingleton getInstance() {
    return INSTANCE;
  }
}
