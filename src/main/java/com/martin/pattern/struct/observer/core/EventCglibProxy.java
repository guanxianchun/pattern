package com.martin.pattern.struct.observer.core;

import java.lang.reflect.Method;

import com.martin.pattern.struct.observer.core.impl.Component;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class EventCglibProxy implements MethodInterceptor {
	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		// 将target对象对应的类设置为父类
		enhancer.setSuperclass(clazz);
		// 设置回调对象
		enhancer.setCallback(this);
		return enhancer.create();

	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object result = proxy.invokeSuper(obj, args);
		afterHandler(obj, method);
		return result;
	}
	
	@SuppressWarnings("unused")
	private void afterHandler(Object obj,Method method) {
		try {
			if (!Component.class.isInstance(obj)) { return; }
			((Component)obj).getEventListener().trigger(method.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
