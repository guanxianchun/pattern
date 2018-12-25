package com.martin.pattern.builder.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
	
	private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();
	
	private BeanFactory(){
		
	}
	
	public static Object getBean(String className) {
		if (ioc.containsKey(className)) {
			return ioc.get(className);
		}else {
			synchronized (ioc) {
				Object obj = null;
				try {
					obj = Class.forName(className).newInstance();
					ioc.put(className, obj);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return obj;
			}
			
		}
	}
}
