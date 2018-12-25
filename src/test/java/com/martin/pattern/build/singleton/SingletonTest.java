package com.martin.pattern.build.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;

import com.martin.pattern.builder.singleton.lazy.ImproveLazySingleton;
import com.martin.pattern.builder.singleton.lazy.LazySingleton;
import com.martin.pattern.builder.singleton.lazy.SyncLazySingleton;
import com.martin.pattern.builder.singleton.register.BeanFactory;

public class SingletonTest {
	public static void main(String[] args) throws Exception {
		int  threads= 20000000;
//		testLazySingleton(threads);
//		testSyncLazySingleton(threads);
//		testImproveLazySingleton(threads);
		testSyncLazySingleton(threads);
		testRefImproveLazySingleton();
		testRegister();
	}
	/**
	 * 测试并发情况下，单例对象被创建多次
	 * @param latch
	 * @param threads
	 */
	public static void testLazySingleton(int threads) {
		CountDownLatch latch = new CountDownLatch(threads);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < threads; i++) {
			new Thread() {
				@Override
				public void run() {
					try {
						try {
							latch.await();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						Object o1 = LazySingleton.getInstance();
						System.out.println(System.currentTimeMillis()+":"+o1);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				}
			}.start();
			
			latch.countDown();
		}
		System.out.println("运行用时：" + (System.currentTimeMillis() - startTime));
	}

	public static void testImproveLazySingleton(int threads) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < threads; i++) {
			Object o1 = ImproveLazySingleton.getInstance();
		}
		System.out.println("运行用时：" + (System.currentTimeMillis() - startTime));
	}
	
	public static void testRefImproveLazySingleton() throws Exception {
		Class<?> clz = ImproveLazySingleton.class;
		Constructor<?> constructor = clz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		Object o1 = constructor.newInstance();
		
		//修改initialized值,还可以初始化单例
		Field field = clz.getDeclaredField("initialized");
		field.setAccessible(true);
		System.out.println("before "+field.getName()+":"+field.getBoolean(o1));
		field.setBoolean(o1, false);
		System.out.println("after "+field.getName()+":"+field.getBoolean(o1));
		
		Object o2 = constructor.newInstance();
		System.out.println(o1==o2);
	}
	public static void testSyncLazySingleton(int threads) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < threads; i++) {
				Object o1 = SyncLazySingleton.getInstance();
		}
		System.out.println("运行用时：" + (System.currentTimeMillis() - startTime));
	}
	
	public static void testRegister() {
		System.out.println(BeanFactory.getBean("com.martin.pattern.builder.factory.bean.DaZhongCar"));
	}
}
