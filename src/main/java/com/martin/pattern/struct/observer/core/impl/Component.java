package com.martin.pattern.struct.observer.core.impl;

import com.martin.pattern.struct.observer.core.EventListener;
import com.martin.pattern.struct.observer.core.IComponent;

/**
 * 组件基类：只有继承了该类，才会触发事件的回调函数，回调过程在代理类中(EventDynamicProxy和EventCglibProxy)
 * 
 * @author 管贤春
 * @时间 2019年1月4日 下午12:58:54
 * @Email psyche19830113@163.com
 * @Description
 */
public class Component implements IComponent{
	
	private EventListener eventListener = new EventListener();
	
	public void addListener(Enum<?> eventType,Object target,String callback) throws Exception{
		eventListener.addListener(eventType, target, callback);
	}
	
	public EventListener getEventListener() {
		return eventListener;
	}
		
}
