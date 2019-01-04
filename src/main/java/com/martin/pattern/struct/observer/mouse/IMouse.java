package com.martin.pattern.struct.observer.mouse;

import com.martin.pattern.struct.observer.core.IComponent;

public interface IMouse extends IComponent{
	
	public void click();

	public void doubleClick();
	
	public void release() ;
	
	public void presse() ;
	
	public void move();
	
	public void enter();
}
