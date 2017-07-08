package com.example.ioc4;

public class OrderManager {
	// HyundaiMaker 객체가 제공하는 서비스 로직을 사용하기 위해서 멤버변수로 갖고 있는 모습
	// OrderManager가 생성자에서 직접 HyundaiMaker 객체를 생성하여 사용할 준비를 갖춘다.
	
	// 수동적 객체관리 프로그래밍
	// OrderManager에게 일을 시키기 전에 OrderManager가 사용해야 할 CarMaker 의 구현 실체 중
	// 하나를 알려주어야 할 의무가 있다.
	// 일반적으로 setter 메소드를 사용해서 OrderManager가 사용 할 전략객체를 알려준다.
	
	private CarMaker maker;
	
	public void order(){
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmount());
		
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName());
	}
	
	public void setMaker(CarMaker maker){
		this.maker = maker;
	}
}
