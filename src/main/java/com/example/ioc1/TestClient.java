package com.example.ioc1;

public class TestClient {
	/**
	 * 이제 OrderManager 클래스는 자기가 사용하는 전략이 변경되어도 OrderManager 클래스 내 코드를 수정할 필요가 없게 됬다.
	 * 이 점이 개발자가 얻은 값진 열매
	 * 1. 인터페이스를 도입한다.
	 * 2. 인터페이스의 구현체가 언급되는 코딩방식을 피한다.
	 * 
	 */
	public static void main(String[] args){
		CarMaker maker = new HyundaiMaker(); // #1
		OrderManager manager = new OrderManager(); // #2
		manager.setMaker(maker);
		manager.order();
	}
}
