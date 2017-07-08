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
		
		
		// 객체관계를 .xml에 표시
		// => WAS가 기동할 때 처리한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
		
		// 객체를 context에서 얻어온다.
		// => Anotation을 사용하여 DI를 통해 객체를 얻는다.
		OrderManager manager = context.getBean("manager", OrderManager.class);
		System.out.println("manager : " + manager);
		manager.order();
	}
}
