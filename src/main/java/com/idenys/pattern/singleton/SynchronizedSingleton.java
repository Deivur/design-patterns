package com.idenys.pattern.singleton;

/**
 * The simplest singleton thread-safe implementation. It is okay if the performance of the
 * getInstance() method is not critical. Keep in mind that synchronizing a method can decrease
 * performance by a factor of 100, so if a high-traffic part of your code begins using
 * getInstance(), you may have to reconsider.
 */
public class SynchronizedSingleton {

  private static SynchronizedSingleton INSTANCE;

  private SynchronizedSingleton() {}

  public static synchronized SynchronizedSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new SynchronizedSingleton();
    }
    return INSTANCE;
  }
}
