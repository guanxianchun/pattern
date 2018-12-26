package com.martin.pattern.struct.strategy;

public class WeiXinPay implements Payment {

	@Override
	public PayStatus pay(String uid,String orderId,double payment) {
		System.out.println("欢迎使用微信支付");
		return new PayStatus("Ok","微信支付",payment);
	}

}
