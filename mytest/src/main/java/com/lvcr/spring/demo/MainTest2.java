package com.lvcr.spring.demo;

import com.lvcr.spring.demo.service.MessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-learn.xml");
		//可以查看org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean()
		MessageService messageService = applicationContext.getBean(MessageService.class, "messageService");
		String message = messageService.getMessage();
		System.out.println(message);
	}

}
