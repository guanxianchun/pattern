package com.martin.pattern.struct.strategy;

public class PayStatus {
	//支付状态
	private String code;
	//支付信息
	private String message;
	//支付金额
	private double payment;
	//支持返回的数据
	private Object data;
	
	public PayStatus(String code,String message,double payment) {
		this.code = code;
		this.message = message;
		this.payment = payment;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "支付状态:"+this.code+", 支付信息:["+this.message+"],支付金额:"+this.payment;
	}
}
