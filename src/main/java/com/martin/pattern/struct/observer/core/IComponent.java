package com.martin.pattern.struct.observer.core;

public interface IComponent {
	public void addListener(Enum<?> eventType,Object target,String callback) throws Exception;
}
