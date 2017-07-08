package com.example.aop.base;

import org.springframework.aop.framework.ProxyFactory;

public class Main {
	// Proxy �� ��ü�� ���� ��  MyAroudAdvice ��  Ÿ�� ��ü�� PrintMsg��  �����Ͽ� ���Ͻ� ����
	public static void main(String[] args){
		IprintMsg target = new PrintMsg();
		
		// Proxy �� ������ ����
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MyAroundAdvice());
		pf.setTarget(target);
		
		PrintMsg proxy = (PrintMsg) pf.getProxy();
		proxy.sayHello();
	}
}
