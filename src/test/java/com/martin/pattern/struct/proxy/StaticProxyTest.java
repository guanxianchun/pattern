package com.martin.pattern.struct.proxy;

import java.awt.Image;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import sun.misc.ProxyGenerator;

public class StaticProxyTest {
	public static void main(String[] args) {
		Man user = new Man("Tom");
		testStaticProxy(user);
		testDynamicProxy(user);
		testCglibProxy();
	}
	
	public static void testStaticProxy(Person user) {
		System.out.println("\ntest static proxy..................");
		StaticProxy proxyObj = new StaticProxy(user);
		System.out.println(proxyObj);
		proxyObj.walk();
	}
	
	public static void testDynamicProxy(Person user) {
		System.out.println("\ntest dynamic proxy..................");
		DynamicProxy proxy = new DynamicProxy(user);
		Person proxyObj = (Person) proxy.getInstance();
		System.out.println(proxyObj.getClass());
		proxyObj.findJob();
		writeClass("$Proxy0", Person.class);
	}
	
	public static void testCglibProxy() {
		System.out.println("\ntest cglib proxy..................");
		Student student = new Student();
		CglibProxy proxy = new CglibProxy();
		Student proxyObj = (Student) proxy.getInstance(student);
		System.out.println(proxyObj);
		proxyObj.goToSchool();
	}
	
	public static void writeClass(String className,Class<?> clazz) {
		try {
			byte[] bytes = ProxyGenerator.generateProxyClass(className, new Class[]{clazz});
			FileOutputStream os = new FileOutputStream("./$proxy0.class");
			os.write(bytes);
			os.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
