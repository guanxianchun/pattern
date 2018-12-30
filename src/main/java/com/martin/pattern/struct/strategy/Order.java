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
	/**
	 * 这一个参数为什么不使用Payment接口
	 * 	1. 完成解决了不需要在代码中写switch语句
	 *  2. 
	 * @author 管贤春
	 * @时间 2018年12月26日 下午3:24:22
	 * @Email psyche19830113@163.com
	 * @param payType
	 * @return
	 */
	public PayStatus pay(PayType payType) {
		return payType.getPay().pay(this.uid,this.orderId,this.payment);
	}
}
