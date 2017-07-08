package com.example.aop.base;

import org.springframework.aop.framework.ProxyFactory;

public class Main {
	// Proxy 后 按眉甫 积己 饶  MyAroudAdvice 棺  鸥百 按眉牢 PrintMsg甫  困葫窍咯 橇废矫 积己
	public static void main(String[] args){
		IprintMsg target = new PrintMsg();
		
		// Proxy 后 伯单扁 积己
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MyAroundAdvice());
		pf.setTarget(target);
		
		PrintMsg proxy = (PrintMsg) pf.getProxy();
		proxy.sayHello();
	}
}
