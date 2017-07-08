package com.example.ioc4;

public class HyundaiMaker implements CarMaker{
	
	public Car sell(Money money){
		// Money 객체를 받고 Car 객체를 직접 만들어서 리턴하는 서비스 로직
		System.out.println("HyundaiMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("sonata");
		System.out.println("HyundaiMaker.sell : I got " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		return car;
		
	}
}
