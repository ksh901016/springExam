package com.example.ioc2;

public class OrderManager {
	// HyundaiMaker 객체가 제공하는 서비스 로직을 사용하기 위해서 멤버변수로 갖고 있는 모습
	// OrderManager가 생성자에서 직접 HyundaiMaker 객체를 생성하여 사용할 준비를 갖춘다.
	// 외부에서 order 메소드를 호출하면 직접 Money 객체를 생성하여 HyundaiMaker 객체의 sell 메소드를 호출할 때 넘겨준다.
	// OrderManager와 HyundaiMaker 객체간의 관계는 강결합 결합도를 띄고 있다.
	// 강결합도를 갖게되면 OrderManager가 다른 객체를 사용하게 하고자 할 때 코드를 수정해야만 변화를 적용할 수 있다.
	
//	private HyundaiMaker maker;
	private KiaMaker maker;
	
	public OrderManager(){
//		maker = new HyundaiMaker();
		maker = new KiaMaker();
	}
	
	public void order(){
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmount());
		
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName());
	}
}
