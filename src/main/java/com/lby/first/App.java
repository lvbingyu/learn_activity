package com.lby.first;

import org.activiti.engine.impl.ProcessEngineImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("--------得到ioc容器1--------");
		System.out.println("applicationContext: " + applicationContext);
		ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource");
		System.out.println("dataSource:" + dataSource);

		ProcessEngineImpl ProcessEngineFactoryBean = (ProcessEngineImpl) applicationContext.getBean("processEngine");
		System.out.println("ProcessEngineFactoryBean:" + ProcessEngineFactoryBean);
	}

}
