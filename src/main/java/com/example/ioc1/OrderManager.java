package com.example.ioc1;

public class OrderManager {
	// HyundaiMaker ��ü�� �����ϴ� ���� ������ ����ϱ� ���ؼ� ��������� ���� �ִ� ���
	// OrderManager�� �����ڿ��� ���� HyundaiMaker ��ü�� �����Ͽ� ����� �غ� �����.
	
	// setter �޼ҵ带 ����ؼ� OrderManager�� ��� �� ������ü�� �˷��ش�.
	
	private CarMaker maker;
	
	public void order(){
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmount());
		
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName());
	}
	
	// #1
	// setMaker �޼ҵ带 ����Ͽ� OrderManager Ŭ�������� �̸� OrderManager�� ����ؾ� �� Ŭ������ CarMaker�� ����ü�� �˷��־�� �Ѵ�.
	// OrderManager Ŭ���� ���ο��� ���� �� �̻� KiaMaker�� HyundaiMaker �ܾ ������ �ʴ´�.
	// ���� ���� ������ü�� �������� �ٲ���� OrderManager Ŭ���� ������ �ڵ带 ������ �ʿ䰡 ���� �Ǿ���.
	public void setMaker(CarMaker maker){
		this.maker = maker;
	}
}
