package com.example.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Ŭ������ �뵵�� �����ϱ� ���� �ϱ� ���ؼ� @Component�� Ȯ���ؼ� ���ο� �ֳ����̼��� �������..
@Service // id�� �������� ������ Ŭ�����̸��� id�� ����Ѵ�. �� id�� �ҹ��ڷ� �����Ѵ�.
public class OrderManager {
	
	// 3.
	// �ڷ������� ã�Ƽ� �־�޶�.
	@Inject
	@Named("kia")
	private CarMaker maker;
	
	// 1.
	// �ڷ��� > ���̵�� ã�Ƽ� ����
	@Autowired // �ʵ庯��, ������, �޼ҵ忡 ����� �����ϴ�.
	public OrderManager(@Qualifier("hyundai") CarMaker maker) {
		// CarMaker �ڷ��������� kia, hyundai 2������ �����ϱ� ������,
		// Qualifer�� ����Ͽ� ��Ȯ�� id�� �������ش�.
		this.maker = maker;
		System.out.println("OrderManager() called");
	}
	
	public void order(){
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmount());
		
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName());
	}
	
	// 2.
	// bean id�� ã�Ƽ� �������ش�.
	// ���̵� > �ڷ������� ã�Ƽ� ����. �����ڿ� ����� �Ұ��ϴ�. (�ʵ庯��, �޼ҵ�)
	@Resource(name="hyundai")
	public void setMaker(CarMaker maker){
		this.maker = maker;
	}
	
	// ��ü�� ������ �� (�����ڰ� ������ ��) �����Ѵ�.
	@PostConstruct
	public void init(){
		// ������ ��ϵ� ������ �ʱ�ȭ �۾��� ���� �޼ҵ�
		System.out.println("OrderManager.init() called");
	}
}
