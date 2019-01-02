package com.martin.pattern.struct.observer.mouse;

import com.martin.pattern.struct.observer.core.Event;

public class MouseCallback {
	public void onClick(Event e) {
		System.out.println("============鼠标单击事件==============\n"+e);
	}

	public void onDoubleClick(Event e) {
		System.out.println("============鼠标双击事件==============\n"+e);
	}
	
	public void onUp(Event e) {
		System.out.println("============鼠标弹起事件==============\n"+e);
	}
	
	public void onDown(Event e) {
		System.out.println("============鼠标按下事件==============\n"+e);
	}
	
	public void onMove(Event e) {
		System.out.println("============鼠标移动事件==============\n"+e);
	}
	
	public void onOver(Event e) {
		System.out.println("============鼠标悬停事件==============\n"+e);
	}
}
