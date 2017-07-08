package com.example.ioc3;

public class OrderManager {
	// HyundaiMaker ��ü�� �����ϴ� ���� ������ ����ϱ� ���ؼ� ��������� ���� �ִ� ���
	// OrderManager�� �����ڿ��� ���� HyundaiMaker ��ü�� �����Ͽ� ����� �غ� �����.
	
	// OrderManager ������� ���� �� �ڷ����� �������̽� ������ ��ĳ�����Ͽ� ������ �� �ִ�.
	// �̷����ϸ� ������ü�� CarMaker�� ������ü�� ������ �� ��������� �ڷ����� ������ �ʿ䰡 ���� �ȴ�.
	
	// �׷��� ���� #2 �κ��� ������ü�� ����� �� �ڵ尡 �����Ǿ�� �Ѵ�.
	// �����ڰ� ��ü������ �����ϴ� �ɵ��� ���α׷��� ����� �����ϰ� �ֱ� �����̴�.
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
