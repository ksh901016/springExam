package com.example.ioc2;

public class OrderManager {
	// HyundaiMaker ��ü�� �����ϴ� ���� ������ ����ϱ� ���ؼ� ��������� ���� �ִ� ���
	// OrderManager�� �����ڿ��� ���� HyundaiMaker ��ü�� �����Ͽ� ����� �غ� �����.
	// �ܺο��� order �޼ҵ带 ȣ���ϸ� ���� Money ��ü�� �����Ͽ� HyundaiMaker ��ü�� sell �޼ҵ带 ȣ���� �� �Ѱ��ش�.
	// OrderManager�� HyundaiMaker ��ü���� ����� ������ ���յ��� ��� �ִ�.
	// �����յ��� ���ԵǸ� OrderManager�� �ٸ� ��ü�� ����ϰ� �ϰ��� �� �� �ڵ带 �����ؾ߸� ��ȭ�� ������ �� �ִ�.
	
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
