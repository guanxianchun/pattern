package com.martin.pattern.struct.observer.subject;

import com.martin.pattern.struct.observer.core.Event;

/**
 * 
 * 
 * @author 管贤春
 * @时间 2019年1月2日 上午10:55:11
 * @Email psyche19830113@163.com
 * @Description
 */
public class Observer {
	
	public void advice(Event event) {
		System.out.println("=================触发事情，打印日志===========================\n"+event);
	}
}
