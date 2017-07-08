package com.example.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	// Aspect 클래스로 Advice(충고용) 메소드 및 포인트컷을 정의한다.
	
	// 주변충곰 정의, sayHello1()메소드 실행 전후에 주입
	@Around("execution(* com.example.aop.aspectj.PrintMsg.*(..))")
	public void myAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("메소드 실행 전");
		pjp.proceed();
		System.out.println("메소드 실행 후");
	}
}
