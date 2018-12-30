package com.martin.pattern.entity;
/**
 * 实体类
 * @author 管贤春
 * @时间 2018年12月26日 下午8:44:44
 * @Email psyche19830113@163.com
 * @Description
 */
public class Member {
	
	private String memberId;
	
	private String name;

	private int age;
	
	private String address;
	
	private String password;
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
