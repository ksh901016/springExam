package com.example.ioc2;

public class TestClient {
	/**
	 * 개발자가 클래스 내부에서 직접 객체를 생성하여 사용.
	 * 개발자가 객체관리를 직접처리하는 능동적 객체관리 프로그래밍 방식
	 * 
	 */
	public static void main(String[] args){
		OrderManager manager = new OrderManager();
		manager.order();
	}
}
