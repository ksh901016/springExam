package com.example.ioc.javaconfig;

// Mutable Class : 상태 값이 변경되는 클래스
public class Money {
	// 값을 보관하기 위해 사용하는 Value Object
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
