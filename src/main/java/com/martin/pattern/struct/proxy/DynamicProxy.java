package com.martin.pattern.struct.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 原理：
 * 	1. 拿到被代理对象的引用，并且获取到它的所有接口（反射获取）
 * 	2. JDK Proxy类重新生成一个新的对象，同时新的类要实现被代理类所有实现
 * 	3. 动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码调用(在代码中体现)
 * 	4. 编译新生成的Java代码
 * 	5. 再重新加载JVM中运行
 *  以上这一个过程就叫字节码重组
 * @author 管贤春
 * @时间 2018年12月23日 下午6:35:04
 * @Email psyche19830113@163.com
 * @Description
 */

public class DynamicProxy implements InvocationHandler {
	
	private Object target;
	
	public DynamicProxy(Object target) {
		this.target = target;
	}
	
	public Object getInstance() {
		Class<?> clazz = this.target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理你找工作.........");
		return method.invoke(this.target, args);
	}

}
