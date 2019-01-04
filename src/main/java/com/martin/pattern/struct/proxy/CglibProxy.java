package com.martin.pattern.struct.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * CGLIB动态代理类
 * 
 * @author 管贤春
 * @时间 2019年1月4日 下午2:53:50
 * @Email psyche19830113@163.com
 * @Description
 */
public class CglibProxy implements MethodInterceptor{
	
	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		//将target对象对应的类设置为父类
		enhancer.setSuperclass(clazz);
		//设置回调对象
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		return proxy.invokeSuper(obj, args);
	}
}
