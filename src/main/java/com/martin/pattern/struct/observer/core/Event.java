package com.martin.pattern.struct.observer.core;

import java.lang.reflect.Method;

public class Event {
	//通知目标
	private Object target;
	//事件源
	private Object source;
	//回调
	private Method callback;
	//触发
	private String trigger;

	private long callTime;
	
	public Event(Object target, Method callback) {
		this.target = target;
		this.callback = callback;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object getSource() {
		return source;
	}

	void setSource(Object source) {
		this.source = source;
	}

	public Method getCallback() {
		return callback;
	}

	public void setCallback(Method callback) {
		this.callback = callback;
	}

	public String getTrigger() {
		return trigger;
	}

	Event setTrigger(String trigger) {
		this.trigger = trigger;
		return this;
	}

	
	public long getCallTime() {
		return callTime;
	}

	public void setCallTime(long callTime) {
		this.callTime = callTime;
	}

	@Override
	public String toString() {
		return "Event [\n\ttarget=" + target + "\n\tsource=" + source + "\n\tcallback=" + callback + "\n\ttrigger=" + trigger
				+ "\n]";
	}
	
}
