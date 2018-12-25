package com.martin.pattern.builder.factory.func;

import com.martin.pattern.builder.bean.Car;
/**
 * 工厂方法：专业的人做传业的事情
 * 工厂必须具备生产产品的能力
 * @author 管贤春
 * @时间 2018年12月23日 下午12:44:48
 * @Email psyche19830113@163.com
 * @Description
 */
public interface Factory {
	//工厂就是生产产品的，提供统一的产品出口
	Car getCar();
	
}
