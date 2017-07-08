package com.example.ioc4;

public class KiaMaker implements CarMaker{
	
	public Car sell(Money money){
		// Money ��ü�� �ް� Car ��ü�� ���� ���� �����ϴ� ���� ����
		System.out.println("KiaMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("Pride");
		System.out.println("KiaMaker.sell : I got " + car.getName());
		System.out.println("KiaMaker.sell : I sold " + car.getName());
		return car;
		
	}
}
