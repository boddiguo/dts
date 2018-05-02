package io.dts.common.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;


public class ThreadFactoryImpl implements ThreadFactory {
  private final AtomicLong threadIndex = new AtomicLong(0);
  private final String threadNamePrefix;

  public ThreadFactoryImpl(final String threadNamePrefix) {
    this.threadNamePrefix = threadNamePrefix;
  }

  @Override
  public Thread newThread(Runnable r) {
		Thread thread = new Thread(r, threadNamePrefix + this.threadIndex.incrementAndGet());
//		thread.setDaemon(true);
		return thread;

  }
}
