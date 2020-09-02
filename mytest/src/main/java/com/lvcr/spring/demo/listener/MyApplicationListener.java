package com.lvcr.spring.demo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @description
 * @author: changrong_lv
 * @version: 1.0
 * @date: 2020/9/2 09:08
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {


	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("com.lvcr.spring.demo.listener.MyApplicationListener.onApplicationEvent");
	}
}
