package com.martin.pattern.builder.singleton.hungry;
/**
 * 单例模式：饿汉式
 * 优点：
 * 		1. 没有加任何锁，执行效率比较高
 * 		2. 在用记体验上来说，比懒汉式更好
 * 缺点：
 * 		1. 类加载过程中就实例化了，不管是否使用都占用空间
 * 
 * 线程绝对安全
 * @author 管贤春
 * @时间 2018年12月23日 下午2:16:37
 * @Email psyche19830113@163.com
 * @Description
 */
public class HungrySingleton {
	
	private final static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){
		
	}
	
	public static HungrySingleton getInstance() {
		return instance;
		
	}
}
