package com.example.ioc2;

public class HyundaiMaker {
	
	public Car sell(Money money){
		// Money ��ü�� �ް� Car ��ü�� ���� ���� �����ϴ� ���� ����
		System.out.println("HyundaiMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("sonata");
		System.out.println("HyundaiMaker.sell : I got " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		return car;
		
	}
}
