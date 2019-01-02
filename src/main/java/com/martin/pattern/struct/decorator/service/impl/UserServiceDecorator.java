package com.martin.pattern.struct.decorator.service.impl;

import com.martin.pattern.entity.Constant;
import com.martin.pattern.entity.ResultMessage;
import com.martin.pattern.struct.adapter.service.IUserService;
import com.martin.pattern.struct.decorator.service.IUserServiceDecorator;
/**
 * 包装器模式：(如：IO流、数据源DataSource等)
 * 		1. 为了某个实现类在不修改原始类的基础上进行动态地覆盖或增加新的方法
 * 		2. 该实现类保持了与原有类的层级关系
 *  		
 *      		装饰器模式                                                                           适配器模式
 * -----------------------------------------------------------------------------------------------------
 * 	 是一种非常特别的适配器模式                                                          可以不保留层级关系
 * -----------------------------------------------------------------------------------------------------
 *  装饰者与被装饰者都实现同一接口                                                    适配者与被适配者之间没有必须的层级关系
 *  主要是为了扩展，依旧保留OOP关系                                                  通常采用代理或继承形式进行包装
 * -----------------------------------------------------------------------------------------------------
 *  满足has-a关系										     满足is-a的关系
 * -----------------------------------------------------------------------------------------------------
 *  注重覆盖、扩展                                                                                   注重兼容、转换
 * -----------------------------------------------------------------------------------------------------
 * @author 管贤春
 * @时间 2018年12月29日 下午3:14:38
 * @Email psyche19830113@163.com
 * @Description
 */
public class UserServiceDecorator implements IUserServiceDecorator{
	
	private IUserService userService;
	/**
	 * 传入父类的接口
	 * @param userService
	 */
	public UserServiceDecorator(IUserService userService) {
		this.userService = userService;
	}
	
	@Override
	public ResultMessage login(String userName, String password) {
		//可以直接覆盖原有的方法
		return this.userService.login(userName, password);
	}

	@Override
	public ResultMessage register(String userName, String password) {
		//可以直接覆盖原有的方法
		return this.userService.register(userName, password);
	}

	@Override
	public String writeToken(String uid) {
		//可以直接覆盖原有的方法
		return this.userService.writeToken(uid);
	}

	@Override
	public ResultMessage loginForQQ(String openId) {
		return this.loginForRegister(openId, Constant.QQEmptyPassword);
	}

	@Override
	public ResultMessage loginForWeiXin(String openId) {
		return this.loginForRegister(openId, Constant.WeiXinEmptyPassword);
	}
	
	
	private ResultMessage loginForRegister(String userName,String password) {
		//先注册
		this.userService.register(userName, password);
		//调用原来的登录接口
		return this.userService.login(userName, password);
	}
}
