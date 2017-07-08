package com.example.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	// Aspect Ŭ������ Advice(����) �޼ҵ� �� ����Ʈ���� �����Ѵ�.
	
	// �ֺ���� ����, sayHello1()�޼ҵ� ���� ���Ŀ� ����
	@Around("execution(* com.example.aop.aspectj.PrintMsg.*(..))")
	public void myAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("�޼ҵ� ���� ��");
		pjp.proceed();
		System.out.println("�޼ҵ� ���� ��");
	}
}
