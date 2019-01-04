package com.martin.pattern.struct.dispatcher;

import java.lang.reflect.Method;

public class Handler {
	//controller对象
	private Object controller;
	//controller的对象方法
	private Method method;
	//请求URL
	private String url;
	//Http请求的访求名
	private String httpMethod;
	
	Object[] params;
	
	public Handler(String url,Object controller,Method method,Object[] params,String httpMethod) {
		this.url = url;
		this.method = method;
		this.controller = controller;
		this.params = params;
		this.httpMethod = httpMethod;
	}
	
	public Object getController() {
		return controller;
	}
	
	public void setController(Object controller) {
		this.controller = controller;
	}
	
	public Method getMethod() {
		return method;
	}
	
	public void setMethod(Method method) {
		this.method = method;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}
	
	public String getHttpMethod() {
		return httpMethod;
	}
	
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	
	
}
