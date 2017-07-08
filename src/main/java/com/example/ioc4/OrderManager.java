package com.example.ioc4;

public class OrderManager {
	// HyundaiMaker ��ü�� �����ϴ� ���� ������ ����ϱ� ���ؼ� ��������� ���� �ִ� ���
	// OrderManager�� �����ڿ��� ���� HyundaiMaker ��ü�� �����Ͽ� ����� �غ� �����.
	
	// ������ ��ü���� ���α׷���
	// OrderManager���� ���� ��Ű�� ���� OrderManager�� ����ؾ� �� CarMaker �� ���� ��ü ��
	// �ϳ��� �˷��־�� �� �ǹ��� �ִ�.
	// �Ϲ������� setter �޼ҵ带 ����ؼ� OrderManager�� ��� �� ������ü�� �˷��ش�.
	
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
