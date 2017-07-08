package com.example.ioc1;

public class TestClient {
	/**
	 * ���� OrderManager Ŭ������ �ڱⰡ ����ϴ� ������ ����Ǿ OrderManager Ŭ���� �� �ڵ带 ������ �ʿ䰡 ���� ���.
	 * �� ���� �����ڰ� ���� ���� ����
	 * 1. �������̽��� �����Ѵ�.
	 * 2. �������̽��� ����ü�� ��޵Ǵ� �ڵ������ ���Ѵ�.
	 * 
	 */
	public static void main(String[] args){
		CarMaker maker = new HyundaiMaker(); // #1
		OrderManager manager = new OrderManager(); // #2
		manager.setMaker(maker);
		manager.order();
	}
}
