package com.martin.pattern.struct.observer;

import java.util.HashMap;
import java.util.Map;

import com.martin.pattern.struct.observer.core.EventCglibProxy;
import com.martin.pattern.struct.observer.core.EventDynamicProxy;
import com.martin.pattern.struct.observer.subject.Observer;
/**
 * 简易容器
 *   与示例观察者共同使用，容器使用反射和动态代理
 * 
 * @author 管贤春
 * @时间 2019年1月2日 下午5:17:39
 * @Email psyche19830113@163.com
 * @Description
 */
public class BeanFactory {
	
	private static final Map<String, Object> ioc = new HashMap<String,Object>();
	
	/**
	 * 判断类是否实现了接口
	 * @author 管贤春
	 * @时间 2019年1月4日 下午2:16:43
	 * @param clazz
	 * @return
	 */
	private boolean isImplementInterface(Class<?> clazz) {
		if (clazz == Object.class) {
			return false;
		}
		Class<?>[] interfaces = clazz.getInterfaces();
		if (interfaces.length>0) {
			return true;
		}
		Class<?> superClass = clazz.getSuperclass();
		return isImplementInterface(superClass);
	}
	
	public Object getBean(Class<?> clazz) throws Exception {
		if (ioc.containsKey(clazz.getName())) {
			return ioc.get(clazz.getName());
		}
		return createBean(clazz);
	}

	public static void main(String[] args) throws Exception {
		new BeanFactory().getBean(Observer.class);
	}
	
	@SuppressWarnings("unused")
	private Object createBean(final Class<?> clazz) throws Exception {
		if (isImplementInterface(clazz)) {
			EventDynamicProxy proxy = new EventDynamicProxy(clazz.newInstance());
			ioc.put(clazz.getName(), proxy.getInstance());
		}else {
			ioc.put(clazz.getName(), new EventCglibProxy().getInstance(clazz));
		}
		return ioc.get(clazz.getName());
	}
	
}
