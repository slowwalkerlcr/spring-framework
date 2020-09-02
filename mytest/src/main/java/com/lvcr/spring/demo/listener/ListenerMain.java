package com.lvcr.spring.demo.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author: changrong_lv
 * @version: 1.0
 * @date: 2020/9/2 09:10
 */
public class ListenerMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-listener.xml");
		System.out.println("=======");
	}
}
