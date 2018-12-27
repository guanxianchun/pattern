package com.martin.pattern.struct.dispatcher.controller;

import com.martin.pattern.struct.template.entity.Member;

public class UserController {
	
	public Member getUserInfo() {
		Member member = new Member();
		member.setMemberId("UID-123");
		member.setAddress("人民路");
		member.setAge(32);
		return member;
	}
}
