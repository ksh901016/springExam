package com.example.ioc1;

public class OrderManager {
	// HyundaiMaker 객체가 제공하는 서비스 로직을 사용하기 위해서 멤버변수로 갖고 있는 모습
	// OrderManager가 생성자에서 직접 HyundaiMaker 객체를 생성하여 사용할 준비를 갖춘다.
	
	// setter 메소드를 사용해서 OrderManager가 사용 할 전략객체를 알려준다.
	
	private CarMaker maker;
	
	public void order(){
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmount());
		
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName());
	}
	
	// #1
	// setMaker 메소드를 사용하여 OrderManager 클래스에게 미리 OrderManager가 사용해야 할 클래스인 CarMaker의 구현체를 알려주어야 한다.
	// OrderManager 클래스 내부에는 이제 더 이상 KiaMaker와 HyundaiMaker 단어가 보이지 않는다.
	// 따라서 실제 전략객체가 무엇으로 바뀌던지 OrderManager 클래스 내부의 코드를 변경할 필요가 없게 되었다.
	public void setMaker(CarMaker maker){
		this.maker = maker;
	}
}
