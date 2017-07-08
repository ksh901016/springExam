package com.example.ioc.xml;

public class KiaMaker implements CarMaker{
	
	public Car sell(Money money){
		// Money 객체를 받고 Car 객체를 직접 만들어서 리턴하는 서비스 로직
		System.out.println("KiaMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("Pride");
		System.out.println("KiaMaker.sell : I got " + car.getName());
		System.out.println("KiaMaker.sell : I sold " + car.getName());
		return car;
		
	}
}
