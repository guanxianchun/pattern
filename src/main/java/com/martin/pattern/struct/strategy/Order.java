package com.martin.pattern.struct.strategy;

public class Order {
	//用户ID
	private String uid;
	//订单ID
	private String orderId;
	//订单金额
	private double payment;
	
	public Order(String uid,String orderId,double payment) {
		this.uid = uid;
		this.orderId = orderId;
		this.payment = payment;
		
	}
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public PayStatus pay(PayType payType) {
		return payType.getPay().pay(this.uid,this.orderId,this.payment);
	}
}
