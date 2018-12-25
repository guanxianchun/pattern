package com.martin.pattern.build.prototype;

import com.martin.pattern.builder.bean.FengTianCar;
import com.martin.pattern.builder.prototype.ProtoType;

public class CloneTest {
	public static void main(String[] args) throws Exception {
		ProtoType protoType = new ProtoType();
		protoType.setName("丰田汽车");
		protoType.getCars().add(new FengTianCar());
		
		testClone(protoType);
		
		testDeepClone(protoType);
	}
	
	public static void testClone(ProtoType protoType) throws Exception {
		System.out.println("clone .................");
		ProtoType clone = (ProtoType) protoType.clone();
		System.out.println(clone.getName());
		System.out.println("origin car: "+protoType.getCars().get(0));
		System.out.println("destinct car: "+clone.getCars().get(0));
		
	}
	
	public static void testDeepClone(ProtoType protoType) {
		System.out.println("deep clone .................");
		ProtoType clone = (ProtoType) protoType.deepClone();
		System.out.println(clone.getName());
		System.out.println("origin car: "+protoType.getCars().get(0));
		System.out.println("destinct car: "+clone.getCars().get(0));
		
	}
}
