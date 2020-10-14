package com.idenys.pattern.singleton;

/**
 * With double-checked locking, we first check to see if an instance is created and if not, THEN we
 * synchronize. This way, we only synchronize the first time through, just what we want.
 * Double-checked locking doesn’t work in Java 1.4 or earlier!
 */
public class DoubleCheckedLockSingleton {

  private static volatile DoubleCheckedLockSingleton INSTANCE;

  private DoubleCheckedLockSingleton() {}

  public static DoubleCheckedLockSingleton getInstance() {
    if (INSTANCE == null) {
      synchronized (DoubleCheckedLockSingleton.class) {
        INSTANCE = new DoubleCheckedLockSingleton();
      }
    }
    return INSTANCE;
  }
}
