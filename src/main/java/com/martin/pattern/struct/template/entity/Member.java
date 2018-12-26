package com.martin.pattern.struct.template.entity;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
