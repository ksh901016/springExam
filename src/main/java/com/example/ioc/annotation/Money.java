package com.example.ioc.annotation;

// Mutable Class : ���� ���� ����Ǵ� Ŭ����
public class Money {
	// ���� �����ϱ� ���� ����ϴ� Value Object
	private int amount;
	
	public Money(){}

	public Money(int amount){
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	};
	
	
}
