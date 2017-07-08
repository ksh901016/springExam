package com.example.ioc1;

public class HyundaiMaker implements CarMaker{
	
	public Car sell(Money money){
		// Money ��ü�� �ް� Car ��ü�� ���� ���� �����ϴ� ���� ����
		System.out.println("HyundaiMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("sonata");
		System.out.println("HyundaiMaker.sell : I got " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		return car;
		
	}
}
