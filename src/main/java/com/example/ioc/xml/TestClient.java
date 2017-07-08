package com.example.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String[] args){
		
//		CarMaker maker = new KiaMaker();
//		CarMaker maker = new HyundaiMaker();
		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		
		// ��ü���踦 .xml�� ǥ��
		// => WAS�� �⵿�� �� ó���Ѵ�.
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
		
		// ��ü�� context���� ���´�.
		// => Anotation�� ����Ͽ� DI�� ���� ��ü�� ��´�.
		OrderManager manager = context.getBean("manager", OrderManager.class);
		System.out.println("manager : " + manager);
		manager.order();
	}
}
