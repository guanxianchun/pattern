package com.martin.pattern.struct.strategy;

public class JDPay implements Payment {

	@Override
	public PayStatus pay(String uid,String orderId,double payment) {
		System.out.println("欢迎使用京东支付");
		return new PayStatus("Ok","京东支付",payment);
	}

}
