package com.example.ioc.javaconfig;

import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Named
public class TestClient {
	
	public static void main(String[] args){
		
//		CarMaker maker = new KiaMaker();
//		CarMaker maker = new HyundaiMaker();
		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("car-config-annotation.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		OrderManager manager = context.getBean("orderManager", OrderManager.class);
		System.out.println("manager : " + manager);
		manager.order();
		
		System.out.println("----------------------");
		
		System.out.println(manager == context.getBean("orderManager", OrderManager.class));
		
		System.out.println("----------------------");
		
		System.out.println(context.getBean("hyundai", HyundaiMaker.class));
		System.out.println(context.getBean("kiaMotors", KiaMaker.class));
		
	}
}
