package com.martin.pattern.builder.factory.abst;

import com.martin.pattern.builder.bean.Car;

/**
 * 抽象工厂方法：
 * 要增加新的功能，只需要扩展新的功能（添加新的方法）
 * @author 管贤春
 * @时间 2018年12月23日 下午12:56:32
 * @Email psyche19830113@163.com
 * @Description
 */
public abstract class AbstractFactory {
	
	public abstract Car getFengTianCar();
	
	public abstract Car getDaZhongCar();
	
}
