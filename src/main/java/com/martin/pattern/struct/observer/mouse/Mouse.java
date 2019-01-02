package com.martin.pattern.struct.observer.mouse;

import com.martin.pattern.struct.observer.core.EventListener;

public class Mouse extends EventListener{
	
	public void click() {
		System.out.println("鼠标单击");
		trigger(MouseEventType.ON_CLICK);
	}

	public void doubleClick() {
		System.out.println("鼠标双击");
		trigger(MouseEventType.ON_DOUBLE_CLICK);
	}
	
	public void up() {
		System.out.println("鼠标弹起");
		trigger(MouseEventType.ON_UP);
	}
	
	public void down() {
		System.out.println("鼠标按下");
		trigger(MouseEventType.ON_DOWN);
	}
	
	public void move() {
		System.out.println("鼠标移动");
		trigger(MouseEventType.ON_MOVE);
	}
	
	public void over() {
		System.out.println("鼠标悬停");
		trigger(MouseEventType.ON_OVER);
	}
}
