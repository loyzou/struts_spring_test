package com.sufow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sufow.action.BaseAction;


public class SufowTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseAction baseAction = (BaseAction) context.getBean("baseAction");
		
		System.out.println(baseAction.getServerLocator().getSufowService().toString());
		
		
		
	}
}
