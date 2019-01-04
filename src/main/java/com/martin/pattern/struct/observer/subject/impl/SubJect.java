package com.martin.pattern.struct.observer.subject.impl;

import com.martin.pattern.struct.observer.core.impl.Component;
import com.martin.pattern.struct.observer.subject.ISubject;
/**
 * 
 * SubJect通过EventListener类的addEventListener方法，将Subject与Observer关联起来
 * 
 * @author 管贤春
 * @时间 2019年1月2日 上午10:59:42
 * @Email psyche19830113@163.com
 * @Description
 */
public class SubJect extends Component implements ISubject{
	
	public void add() {
		System.out.println("-------------调用一个ADD方法-------------");
	}
	
	public void remove() {
		System.out.println("-------------调用一个remove方法-------------");
	}
	
	public void update() {
		System.out.println("-------------调用一个update方法-------------");
	}
	
	public void query() {
		System.out.println("-------------调用一个query方法-------------");
	}
}
