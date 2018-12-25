package com.martin.pattern.builder.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.martin.pattern.builder.bean.Car;

public class ProtoType implements Cloneable,Serializable {

	private String name;

	private List<Car> cars = new ArrayList<Car>();

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public ProtoType() {
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Object deepClone() {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
