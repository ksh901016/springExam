package com.example.ioc3;

public class Car {
	// �ڵ��� ���������� �����ϴ� Value Object
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