package com.fx.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MainStat
 * @Description
 * @Author fuxing
 * @Date 2022/04/04 00:18
 * @Verson 1.0
 */
@Configuration
@ComponentScan("com.fx.service")
public class MainStat {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStat.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();

	}
}
