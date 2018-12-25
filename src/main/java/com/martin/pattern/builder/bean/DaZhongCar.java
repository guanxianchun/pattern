package com.martin.pattern.builder.bean;

public class DaZhongCar implements Car{
	private String name = "大众汽车";
	@Override
	public String getName() {
		return this.name;
	}
}
