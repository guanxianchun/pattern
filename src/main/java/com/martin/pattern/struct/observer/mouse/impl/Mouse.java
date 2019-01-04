package com.martin.pattern.struct.observer.mouse.impl;

import com.martin.pattern.struct.observer.core.impl.Component;
import com.martin.pattern.struct.observer.mouse.IMouse;

public class Mouse extends Component implements IMouse{
	
	public void click() {
		System.out.println("-------------鼠标单击-------------");
	}

	public void doubleClick() {
		System.out.println("-------------鼠标双击-------------");
	}
	
	public void release() {
		System.out.println("-------------鼠标弹起-------------");
	}
	
	public void presse() {
		System.out.println("-------------鼠标按下-------------");
	}
	
	public void move() {
		System.out.println("-------------鼠标移动-------------");
	}
	
	public void enter() {
		System.out.println("-------------鼠标移入-------------");
	}
}
