package com.example.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	// XML Schema Base AOP ����
	// pjp.process() �޼ҵ带 ���� Ÿ��Ŭ������ sayHello1() �޼ҵ� ȣ��
	public void myAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("�޼ҵ� ���� ��");
		pjp.proceed();
		System.out.println("�޼ҵ� ���� ��");
	}
}
