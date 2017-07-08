package com.example.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aspectj.xml");
		IPrintMsg printMsg = (IPrintMsg) ctx.getBean("printMsg");
		
		printMsg.sayHello1();
		printMsg.sayHello2();
	}
}
