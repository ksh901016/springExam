package com.example.ioc.xml;

public class OrderManager {
	
	private CarMaker maker;
	
	public OrderManager(CarMaker maker) {
		this.maker = maker;
		System.out.println("OrderManager() called");
	}
	
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
	
	public void init(){
		// ������ ��ϵ� ������ �ʱ�ȭ �۾��� ���� �޼ҵ�
		System.out.println("OrderManager.init() called");
	}
}
