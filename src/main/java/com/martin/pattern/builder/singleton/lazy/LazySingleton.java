package com.martin.pattern.builder.singleton.lazy;
/**
 * 单例模式：懒汉式
 *		在外部使用时才实例化。
 * @author 管贤春
 * @时间 2018年12月23日 下午2:21:11
 * @Email psyche19830113@163.com
 * @Description
 */
public class LazySingleton {
	
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static LazySingleton getInstance() {
		//判断是否实例化，这样存在线程安全问题
		//解决线程安全性，
		//1. 可以在方法上加synchronized关键字,这会产生性能问题
		if (instance == null) {
			instance = new LazySingleton();
		}
		//已经初始化，则直接返回实例
		return instance;
		
	}
}
