package com.martin.pattern.struct.decorator.service;

import com.martin.pattern.entity.ResultMessage;
import com.martin.pattern.struct.adapter.service.IUserService;

/**
 * 
 * 
 * @author 管贤春
 * @时间 2018年12月29日 下午3:13:15
 * @Email psyche19830113@163.com
 * @Description
 */
public interface IUserServiceDecorator extends IUserService{
	/**
	 * 
	 * @author 管贤春
	 * @时间 2018年12月29日 下午3:47:02
	 * @param openId
	 * @return
	 */
	public ResultMessage loginForQQ(String openId);
	/**
	 * 
	 * @author 管贤春
	 * @时间 2018年12月29日 下午3:47:23
	 * @param openId
	 * @return
	 */
	public ResultMessage loginForWeiXin(String openId);
}
