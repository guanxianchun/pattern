package com.martin.pattern.builder.factory.simple;

import com.martin.pattern.builder.bean.Car;
import com.martin.pattern.builder.bean.DaZhongCar;
import com.martin.pattern.builder.bean.FengTianCar;

/**
 * 简单工厂模式：小作坊(什么都可以生产，三无产品)
 * @author 管贤春
 * @时间 2018年12月23日 下午12:03:02
 * @Email psyche19830113@163.com
 * @Description
 */
public class SimpleFactory {
	
	public Car getCar(String name) {
		if ("丰田汽车".equals(name)) {
			return new FengTianCar();
		}else if ("大众汽车".equals(name)) {
			return new DaZhongCar();
		}else {
			System.out.println("不能生产所需的汽车");
			return null;
		}
		
	}
	
}
