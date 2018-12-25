package com.martin.pattern.struct.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	
	public Object getInstance(Object target) {
		Enhancer enhancer = new Enhancer();
		//将target对象对应的类设置为父类
		enhancer.setSuperclass(target.getClass());
		//设置回调对象
		enhancer.setCallback(this);
		return enhancer.create();
		
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		return proxy.invokeSuper(obj, args);
	}
}
