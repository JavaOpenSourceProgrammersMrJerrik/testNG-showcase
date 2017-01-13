package com.fsnc.testng.thread;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MultiThreadTest {

	static Random random = new Random();

	/**
	 * 3个线程池 重复执行10次 超时1s
	 * 
	 * @throws InterruptedException
	 */
	@Test(threadPoolSize = 5, timeOut = 1000, invocationCount = 10)
	public void testShow() {
		try {
			TimeUnit.SECONDS.sleep(random.nextInt(2));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("test show");
	}

	@Test(threadPoolSize = 10, timeOut = 1000, invocationCount = 10)
	public void testPrintCurrentThread() {
		System.out.println(Thread.currentThread().getId());
	}

	static int count = 0;

	@Test(threadPoolSize = 30, timeOut = 1000, invocationCount = 2000)
	public void testIncrement() {
		count++;
	}

	/*@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}*/

}
