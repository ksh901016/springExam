package com.example.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopxml.xml");
		IPrintMsg printMsg = (IPrintMsg) ctx.getBean("printMsg");
		// sayHello1�� ��� ���������� �Ǿ��ִ�.
		printMsg.sayHello1();
		printMsg.sayHello2();
	}
}
