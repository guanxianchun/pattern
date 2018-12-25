package com.martin.pattern.builder.singleton.seriable;

import java.io.Serializable;
/**
 * 序列化：就是将内存中的状态通过转化成字节码的形式，从而转换成IO流，写入到其他地方(如磁盘、网络IO)
 * 
 * 反序列化：就是将已经持久化的字节码的内容，转换成IO流，通过读取IO流的内容并其转换成Java对象
 * 
 * 反序列化会导致单例破坏
 * 
 * @author 管贤春
 * @时间 2018年12月23日 下午4:23:39
 * @Email psyche19830113@163.com
 * @Description
 */
public class Seriable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Seriable INSTANCE = new Seriable();
	private Seriable(){}
	
	public static Seriable getInstance() {
		return INSTANCE;
	}
	
	public static Seriable readResolve() {
		return INSTANCE;
	}
}
