package com.martin.pattern.struct.strategy;

public class AliPay implements Payment {

	@Override
	public PayStatus pay(String uid,String orderId,double payment) {
		System.out.println("欢迎使用阿里支付");
		return new PayStatus("Ok","阿里支付",payment);
	}

}
