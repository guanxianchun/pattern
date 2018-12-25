package com.martin.pattern.builder.factory.func;

import com.martin.pattern.builder.bean.Car;
import com.martin.pattern.builder.bean.FengTianCar;

/**
 * 特伦苏工厂专门生产特伦苏牛奶
 * @author 管贤春
 * @时间 2018年12月23日 下午12:46:33
 * @Email psyche19830113@163.com
 * @Description
 */
public class FengTianCarFactory implements Factory {

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new FengTianCar();
	}

}
