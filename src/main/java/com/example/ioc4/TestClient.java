package com.example.ioc4;

public class TestClient {
	/**
	 * �����ڰ� Ŭ���� ���ο��� ���� ��ü�� �����Ͽ� ���.
	 * �����ڰ� ��ü������ ����ó���ϴ� �ɵ��� ��ü���� ���α׷��� ���
	 * 
	 */
	public static void main(String[] args){
		
		CarMaker maker = new HyundaiMaker();
		OrderManager manager = new OrderManager();
		manager.setMaker(maker);
		manager.order();
	}
}
