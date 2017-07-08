package com.example.aop.base;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {
	// Around Advice의 구현체 충고
	// MethodInterceptor는 메소드 호출용 어라운드 어드바이스의 표준 인터페이스
	// 이 객체를 사용하면 메소드 호출이 실행되는 시점(메소드 실행 전/후)를 제어 가능
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("메소드 실행 전");
		Object ret = invocation.proceed();
		System.out.println("메소드 실행 후");
		return ret;
	}
	
}
