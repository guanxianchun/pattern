package com.martin.pattern.struct.observer.subject;
/**
 * 
 * 
 * @author 管贤春
 * @时间 2019年1月4日 下午1:17:33
 * @Email psyche19830113@163.com
 * @Description
 */
public enum SubjectEventType {
	ON_ADD("add"), ON_REMOVE("remove"), ON_UPDATE("update"), ON_QUERY("query");
	
	private String method;

	private SubjectEventType(String method) {
		this.method = method;
	}
	
	@Override
	public String toString() {
		return this.method;
	}
}
