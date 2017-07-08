package com.example.ioc.annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Named
public class TestClient {
	
	@Inject
	private OrderManager orderManager;
	public static void main(String[] args){
		
//		CarMaker maker = new KiaMaker();
//		CarMaker maker = new HyundaiMaker();
		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config-annotation.xml");
		
		OrderManager manager = context.getBean("orderManager", OrderManager.class);
		System.out.println("manager : " + manager);
		manager.order();
		
		System.out.println("----------------------");
		
		TestClient testClient = context.getBean("testClient", TestClient.class);
		
		System.out.println("----------------------");
		
		System.out.println(manager);
		System.out.println(testClient.orderManager);
		System.out.println(context.getBean("orderManager", OrderManager.class));
	}
}
