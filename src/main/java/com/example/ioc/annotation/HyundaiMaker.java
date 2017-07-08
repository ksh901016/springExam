package com.example.ioc.annotation;

import org.springframework.stereotype.Component;

/**
 * <bean id="hyundai" class="com.example.ioc.annotation.HyundaiMaker"/>
 * @Component(id)
 */
@Component("hyundai")
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
