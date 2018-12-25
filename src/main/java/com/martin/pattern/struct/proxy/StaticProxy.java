package com.martin.pattern.struct.proxy;
/**
 * 
 * @author 管贤春
 * @时间 2018年12月23日 下午6:35:10
 * @Email psyche19830113@163.com
 * @Description
 */
public class StaticProxy {
	private Person user;
	
	public StaticProxy(Person user){
		this.user = user;
	}
	
	public void walk() {
		this.user.findJob();
	}
}

