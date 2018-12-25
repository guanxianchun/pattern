package com.martin.pattern.builder.factory.func;

import com.martin.pattern.builder.bean.Car;
import com.martin.pattern.builder.bean.DaZhongCar;

/**
 * 伊利工厂专门生产伊利牛奶
 * @author 管贤春
 * @时间 2018年12月23日 下午12:48:08
 * @Email psyche19830113@163.com
 * @Description
 */
public class DaZhongCaFactory implements Factory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new DaZhongCar();
	}
	
}
