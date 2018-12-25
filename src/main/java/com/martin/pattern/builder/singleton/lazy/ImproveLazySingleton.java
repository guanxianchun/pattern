package com.martin.pattern.builder.singleton.lazy;
/**
 * 单例模式：懒汉式
 * 外部类被调用的时候内部类才被实例化
 * 它整合了饿汉模式和懒汉模式的优点：空间和性能
 * @author 管贤春
 * @时间 2018年12月23日 下午2:42:41
 * @Email psyche19830113@163.com
 * @Description
 */
public class ImproveLazySingleton {
	private static boolean initialized = false;
	
	private ImproveLazySingleton() {
		synchronized (ImproveLazySingleton.class) {
			if (initialized == false) {
				initialized = !initialized;
			}else {
				throw new RuntimeException("单例被侵犯");
			}
		}
	}
	
	public static final ImproveLazySingleton getInstance() {
		return LazySingletonHolder.lazy;
		
	}
	//内部类在外部类被调用时才会实例化，默认不会实例化
	private static class LazySingletonHolder{
		private static final ImproveLazySingleton lazy = new ImproveLazySingleton();
	}
}
