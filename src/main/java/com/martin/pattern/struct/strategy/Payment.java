package com.martin.pattern.struct.strategy;
/**
 * 策略模式：
 * 	应用场景：根据用户的需求处理数据时，需要对算法做出选择，固定的一些算法（不再发生变化的算法），客户只有选择的权力。
 *           不具有改变算法的权力，不管采用什么算法，其结果是一样的。
 * 
 * @author 管贤春
 * @时间 2018年12月26日 下午2:59:58
 * @Email psyche19830113@163.com
 * @Description
 */
public interface Payment {
	
	public PayStatus pay(String uid,String orderId,double payment);
}
