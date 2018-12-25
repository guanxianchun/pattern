package com.martin.pattern.build.factory;

import com.martin.pattern.builder.factory.simple.SimpleFactory;

public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		//用户需要产品，要告诉工厂需要的产品名称
		//产品的生产过程隐藏了
		//产品名要用户输入，可能存在用户输入错误问题
		SimpleFactory factory = new SimpleFactory();
		System.out.println(factory.getCar("丰田汽车"));
	}
}
