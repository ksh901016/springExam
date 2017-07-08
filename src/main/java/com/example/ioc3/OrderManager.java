package com.example.ioc3;

public class OrderManager {
	// HyundaiMaker 객체가 제공하는 서비스 로직을 사용하기 위해서 멤버변수로 갖고 있는 모습
	// OrderManager가 생성자에서 직접 HyundaiMaker 객체를 생성하여 사용할 준비를 갖춘다.
	
	// OrderManager 멤버변수 선언 시 자료형을 인터페이스 형으로 업캐스팅하여 선언할 수 있다.
	// 이렇게하면 전략객체인 CarMaker의 구현객체를 변경할 때 멤버변수의 자료형을 변경할 필요가 없게 된다.
	
	// 그러나 아직 #2 부분은 전략객체가 변경될 때 코드가 수정되어야 한다.
	// 개발자가 객체관리를 직접하는 능동적 프로그래밍 방식을 적용하고 있기 때문이다.
	//#1
//	private HyundaiMaker maker;
//	private KiaMaker maker;
	private CarMaker maker;
	
	//#2
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
