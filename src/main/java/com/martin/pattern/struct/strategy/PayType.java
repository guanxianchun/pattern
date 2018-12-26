package com.martin.pattern.struct.strategy;
/**
 * 设计模式创建类型类设计模式(也可以采用注册类类型)
 * 
 * 支付类型，这里采用的是枚举类型
 * 
 * @author 管贤春
 * @时间 2018年12月26日 下午3:07:52
 * @Email psyche19830113@163.com
 * @Description
 */
public enum PayType {
	
	AlI_PAY(new AliPay()),WEIXIN_PAY(new WeiXinPay()),JD_PAY(new JDPay());
	
	private Payment payment;
	
	private PayType(Payment payment){
		this.payment = payment;
	}
	
	public Payment getPay() {
		return this.payment;
	}
}
