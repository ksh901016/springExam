package com.example.ioc.javaconfig;

public interface CarMaker {
	// 결합도를 떨어뜨리는 첫 번째 수순은 서비스를 제공하는 전략 클래스가 인터페이스를 구현하도록 만드는 것
	// 인터페이스를 도입함으로써 결합도를 약결합으로 만들 수 있다.
	
	public Car sell(Money money);

}
