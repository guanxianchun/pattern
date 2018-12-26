package com.martin.pattern.struct.dispatcher;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 这里只是说明委派设计模式，在spring中包含Delegate或Dispatcher的类就是委派模式的应用
 * 
 * @author 管贤春
 * @时间 2018年12月26日 下午9:43:32
 * @Email psyche19830113@163.com
 * @Description
 */
public class ServletDispatcher {

	List<Handler> handlerMapping = new ArrayList<Handler>();
	
	public ServletDispatcher() {
		// TODO Auto-generated constructor stub
	}
	
	private void init() {
		
		
	}
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void doService(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//接受用户的请求，对进行委派处理
		this.doDispather(request, response);
	}
	
	/**
	 * 委派请求
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws Exception 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	private void doDispather(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//1. 获取用户请求的URI
		String uri = request.getRequestURI();
		//2. 通过Servlet拿到的URI，要做权衡（要做判断，做选择）
		//   通过URI去handlerMapping找到相应的handler
		Handler handler = this.getRequestHandler(request);
		if (null == handler) {
			response.getWriter().write("404 Not Found");
			return;
		}
		//4. 将具体的任务分配给method
		Object result = handler.getMethod().invoke(handler.getController(), null);
		//5. 获取method的执行结果，将结果通过response返回回去
		response.getWriter().write(result.toString());
		
	}
	
	private Handler getRequestHandler(HttpServletRequest request) {
		String uri = request.getRequestURI();
		return null;
	}
}
