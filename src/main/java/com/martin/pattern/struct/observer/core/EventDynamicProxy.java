package com.martin.pattern.struct.observer.core;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.martin.pattern.struct.observer.core.impl.Component;
/**
 * 
 * 
 * @author 管贤春
 * @时间 2019年1月4日 下午12:59:27
 * @Email psyche19830113@163.com
 * @Description
 */
public class EventDynamicProxy implements InvocationHandler{

	private Object target;
	
	public EventDynamicProxy(Object target) {
		this.target = target;
		
	}
	
	public Object getInstance() {
		Class<?> clazz = this.target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(target, args);
		this.afterHandler(method.getName());
		return result;
	}

	private void afterHandler(final String method) {
		try {
			if (!Component.class.isInstance(this.target)) { return; }
			((Component)this.target).getEventListener().trigger(method);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
