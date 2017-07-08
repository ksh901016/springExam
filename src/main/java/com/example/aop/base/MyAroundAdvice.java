package com.example.aop.base;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {
	// Around Advice�� ����ü ���
	// MethodInterceptor�� �޼ҵ� ȣ��� ����� �����̽��� ǥ�� �������̽�
	// �� ��ü�� ����ϸ� �޼ҵ� ȣ���� ����Ǵ� ����(�޼ҵ� ���� ��/��)�� ���� ����
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("�޼ҵ� ���� ��");
		Object ret = invocation.proceed();
		System.out.println("�޼ҵ� ���� ��");
		return ret;
	}
	
}
