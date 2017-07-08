package com.example.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * pom.xml�� �ʿ�
 * <dependency>
 * 	<groupId>cglib</groupId>
 *  <artifactId>cglib</artifactId>
 *  <version>2.2.2</version>
 * </dependency>
 *
 */

@Configuration
// ��ĵ�� ���ؼ� CarConfig Ŭ������ ������ ����ϱ� ���ؼ��� @Component ������ �ʿ��ϴ�.
@Component
public class CarConfig {
	
	// �� id�� �����ؼ� ����Ѵ�.
	@Bean(name="hyundai")
	public CarMaker hyundaiMaker(){
		CarMaker maker = new HyundaiMaker();
		return maker;
	}
	
	// �� id�� �����ϸ� �޼ҵ���� id�� ����Ѵ�.
	@Bean
	public CarMaker kiaMotors(){
		CarMaker maker = new KiaMaker();
		return maker;
	}
	
	//@PostConstruct �ֳ����̼��� �ش� �޼ҵ忡 �����ؼ� ����ص� ��-��.
	@Bean(initMethod="init")
	public OrderManager orderManager(){
		OrderManager  manager = new OrderManager(kiaMotors());
		return manager;
	}
	
}
