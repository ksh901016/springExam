package com.example.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	// XML Schema Base AOP 구현
	// pjp.process() 메소드를 통해 타겟클래스의 sayHello1() 메소드 호출
	public void myAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("메소드 실행 전");
		pjp.proceed();
		System.out.println("메소드 실행 후");
	}
}
