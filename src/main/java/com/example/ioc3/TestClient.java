package com.example.ioc3;

public class TestClient {
	/**
	 * �����ڰ� Ŭ���� ���ο��� ���� ��ü�� �����Ͽ� ���.
	 * �����ڰ� ��ü������ ����ó���ϴ� �ɵ��� ��ü���� ���α׷��� ���
	 * 
	 */
	public static void main(String[] args){
		OrderManager manager = new OrderManager();
		manager.order();
	}
}
