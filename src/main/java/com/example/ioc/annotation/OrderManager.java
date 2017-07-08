package com.example.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// 클래스의 용도를 구분하기 쉽게 하기 위해서 @Component를 확장해서 새로운 애노테이션을 만들었다..
@Service // id를 지정하지 않으면 클래스이름을 id로 사용한다. 단 id는 소문자로 시작한다.
public class OrderManager {
	
	// 3.
	// 자료형으로 찾아서 넣어달라.
	@Inject
	@Named("kia")
	private CarMaker maker;
	
	// 1.
	// 자료형 > 아이디로 찾아서 주입
	@Autowired // 필드변수, 생성자, 메소드에 사용이 가능하다.
	public OrderManager(@Qualifier("hyundai") CarMaker maker) {
		// CarMaker 자료형변수가 kia, hyundai 2가지가 존재하기 때문에,
		// Qualifer를 사용하여 명확한 id를 지정해준다.
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
	// bean id를 찾아서 주입해준다.
	// 아이디 > 자료형으로 찾아서 주입. 생성자에 사용이 불가하다. (필드변수, 메소드)
	@Resource(name="hyundai")
	public void setMaker(CarMaker maker){
		this.maker = maker;
	}
	
	// 객체가 생성된 후 (생성자가 실행한 후) 실행한다.
	@PostConstruct
	public void init(){
		// 빈으로 등록된 다음에 초기화 작업을 위한 메소드
		System.out.println("OrderManager.init() called");
	}
}
