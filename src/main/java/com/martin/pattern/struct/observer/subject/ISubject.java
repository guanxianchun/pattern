package com.martin.pattern.struct.observer.subject;

import com.martin.pattern.struct.observer.core.IComponent;

public interface ISubject extends IComponent{
	
	public void add();
	
	public void remove();
	
	public void update();
	
	public void query();
	
}
