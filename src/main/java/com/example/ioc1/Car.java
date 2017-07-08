package com.example.ioc1;

public class Car {
	// 자동차 관련정보를 관리하는 Value Object
	private String name;
	
	public Car(){}
	
	public Car(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
