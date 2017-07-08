package com.example.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * pom.xml에 필요
 * <dependency>
 * 	<groupId>cglib</groupId>
 *  <artifactId>cglib</artifactId>
 *  <version>2.2.2</version>
 * </dependency>
 *
 */

@Configuration
// 스캔을 통해서 CarConfig 클래스를 빈으로 등록하기 위해서는 @Component 설정이 필요하다.
@Component
public class CarConfig {
	
	// 빈 id를 지정해서 사용한다.
	@Bean(name="hyundai")
	public CarMaker hyundaiMaker(){
		CarMaker maker = new HyundaiMaker();
		return maker;
	}
	
	// 빈 id를 생략하면 메소드명을 id로 사용한다.
	@Bean
	public CarMaker kiaMotors(){
		CarMaker maker = new KiaMaker();
		return maker;
	}
	
	//@PostConstruct 애노테이션을 해당 메소드에 설정해서 사용해도 된-다.
	@Bean(initMethod="init")
	public OrderManager orderManager(){
		OrderManager  manager = new OrderManager(kiaMotors());
		return manager;
	}
	
}
