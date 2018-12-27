package com.martin.pattern.struct.dispatcher;

import java.lang.reflect.Method;

public class Handler {
	//controller对象
	private Object controller;
	//controller的对象方法
	private Method method;
	//请求URL
	private String url;
	
	Object[] params;
	
	public Handler(String url,Object controller,Method method,Object[] params) {
		this.url = url;
		this.method = method;
		this.controller = controller;
		this.params = params;
	}
	/**
	 * @return the controller
	 */
	public Object getController() {
		return controller;
	}
	/**
	 * @param controller the controller to set
	 */
	public void setController(Object controller) {
		this.controller = controller;
	}
	/**
	 * @return the method
	 */
	public Method getMethod() {
		return method;
	}
	/**
	 * @param method the method to set
	 */
	public void setMethod(Method method) {
		this.method = method;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the params
	 */
	public Object[] getParams() {
		return params;
	}
	/**
	 * @param params the params to set
	 */
	public void setParams(Object[] params) {
		this.params = params;
	}
	
	
}
