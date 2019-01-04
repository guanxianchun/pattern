package com.martin.pattern.struct.observer.mouse;

public enum MouseEventType {
	ON_CLICKED("click"),
	ON_DOUBLE_CLICKED("doubleClick"),
	ON_RELEASED("release"),
	ON_PRESSED("press"),
	ON_ENTERED("enter"),
	ON_MOVED("move");
	
	private String method;
	
	private MouseEventType(String method) {
		this.method = method;
	}
	
	@Override
	public String toString() {
		return this.method;
	}
}
