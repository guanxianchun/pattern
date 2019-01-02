package com.martin.pattern.struct.adapter.service.impl;

import com.martin.pattern.entity.Constant;
import com.martin.pattern.entity.ResultMessage;

/**
 * 适配置器模式：原系统的接口已经很稳定了，不想动原来的代码的情况下，为了增加新的需求功能而做的接口兼容
 * 	  如果每一种登录也比较复杂，可以每种都创建一个Adapter类
 *   原来稳定的方法不动，直接继承下来
 * @author 管贤春
 * @时间 2018年12月29日 下午2:38:01
 * @Email psyche19830113@163.com
 * @Description
 */
public class UserServiceAdapter extends UserService{
	
	public ResultMessage loginForQQ(String openId) {
		//1. openId是唯一的，可以认为是UserName
		//2. 默认密码为固定密码QQEmptyPassword
		//3. 在原有系统中注册一个用户
		//4. 调用原来的登录接口
		return this.loginForRegister(openId, Constant.QQEmptyPassword);
	}
	
	public ResultMessage loginForWeiXin(String openId) {
		//1. openId是唯一的，可以认为是UserName
		//2. 默认密码为固定密码WeiXinEmptyPassword
		//3. 在原有系统中注册一个用户
		//4. 调用原来的登录接口
		return this.loginForRegister(openId, Constant.WeiXinEmptyPassword);
	}
	
	public ResultMessage loginForTelephone(String phoneNumber,String code) {
		//1. openId是唯一的，可以认为是UserName
		//2. 默认密码为固定密码
		//3. 在原有系统中注册一个用户
		//4. 调用原来的登录接口
		return this.loginForRegister(phoneNumber, Constant.WeiXinEmptyPassword);
	}
	
	public ResultMessage loginForRegister(String userName,String password) {
		//先注册
		this.register(userName, password);
		//4. 调用原来的登录接口
		return this.login(userName, password);
	}
	
	public ResultMessage loginForToken(String token) {
		//1.通过token拿到用户信息，再重新登录一次,简单处理
		String[] userInfo = token.split("\\|");
		return this.login(userInfo[0], userInfo[1]);
	}
}
