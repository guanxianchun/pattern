package com.martin.pattern.struct.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * 
 * @author 管贤春
 * @时间 2019年1月2日 上午10:51:03
 * @Email psyche19830113@163.com
 * @Description
 */
public class EventListener {
	
	protected Map<Enum<?>, Event> events = new HashMap<Enum<?>,Event>();
	/**
	 * 
	 * @author 管贤春
	 * @时间 2019年1月2日 上午11:04:10
	 * @param eventType 事件类型
	 * @param target 通知目标对象
	 * @param callback 回调方法
	 */
	public void addListener(Enum<?> eventType,Object target,Method callback){
		//注册事件
		events.put(eventType, new Event(target, callback));
	}
	/**
	 * 使用反射调用目标对象的方法
	 * @author 管贤春
	 * @时间 2019年1月2日 下午1:31:00
	 * @param e
	 */
	private void trigger(Event e){
		try {
			//设置事件源
			e.setSource(this);
			e.getCallback().invoke(e.getTarget(), e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	protected void trigger(Enum<?> call) {
		if (!events.containsKey(call)) {
			System.out.println(call);
			return;
		}
		trigger(events.get(call).setTrigger(call.toString()));
	}
}
