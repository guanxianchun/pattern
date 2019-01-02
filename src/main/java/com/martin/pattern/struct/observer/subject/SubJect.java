package com.martin.pattern.struct.observer.subject;

import com.martin.pattern.struct.observer.core.EventListener;
/**
 * 
 * SubJect通过EventListener类的addEventListener方法，将Subject与Observer关联起来
 * 
 * @author 管贤春
 * @时间 2019年1月2日 上午10:59:42
 * @Email psyche19830113@163.com
 * @Description
 */
public class SubJect extends EventListener {
	
	//这里可以采用动态代理来一起使用，防止代码的侵入
	public void add() {
		System.out.println("调用一个ADD方法");
		trigger(EventType.ON_ADD);
	}
	
	public void remove() {
		System.out.println("调用一个remove方法");
		trigger(EventType.ON_REMOVE);
	}
	
	public void update() {
		System.out.println("调用一个update方法");
		trigger(EventType.ON_UPDATE);
	}
	
	public void query() {
		System.out.println("调用一个query方法");
		trigger(EventType.ON_QUERY);
	}
}
