package com.martin.pattern.struct.proxy;

public interface Person {
	
	public void findJob();
	
}


class Man implements Person{
	private String name;
	
	public Man(String name) {
		this.name = name;
	}
		
	@Override
	public void findJob() {
		System.out.println(this.name +" 找到了一个工作.");
	}
	
}


class Student{
	
	public void goToSchool() {
		System.out.println("I am going to school..");
		
	}
}
