package com.martin.pattern.builder.factory.abst;

import com.martin.pattern.builder.bean.Car;
import com.martin.pattern.builder.factory.func.DaZhongCaFactory;
import com.martin.pattern.builder.factory.func.FengTianCarFactory;
/**
 * 抽象工厂+工厂方法
 * @author 管贤春
 * @时间 2018年12月23日 下午1:02:03
 * @Email psyche19830113@163.com
 * @Description
 */
public class CarFactory extends AbstractFactory{

	@Override
	public Car getFengTianCar() {
		// TODO Auto-generated method stub
		return new FengTianCarFactory().getCar();
	}

	@Override
	public Car getDaZhongCar() {
		// TODO Auto-generated method stub
		return new DaZhongCaFactory().getCar();
	}
	
}
