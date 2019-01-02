package com.martin.pattern.struct.adapter.impl;

import java.util.UUID;

import com.martin.pattern.entity.ResultMessage;
import com.martin.pattern.struct.adapter.IUserService;
/**
 * 
 * 本地
 * @author 管贤春
 * @时间 2018年12月29日 下午2:31:54
 * @Email psyche19830113@163.com
 * @Description
 */
public class UserService implements IUserService {

	@Override
	public ResultMessage login(String userName, String password) {
		System.out.println("用户:"+userName+"登录成功");
		String token = this.writeToken("uid-1");
		return new ResultMessage("Ok","用户登录成功",token);
	}

	@Override
	public ResultMessage register(String userName, String password) {
		System.out.println("注册用户:"+userName+"成功");
		return new ResultMessage("Ok","用户注册成功","");
	}
	
	@Override
	public String writeToken(String uid) {
		System.out.println("生成token并保存到Cookie中,登录成功！");
		return UUID.randomUUID().toString();
	}

}
