package com.internetshop.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.internetshop.entity.User;
import com.internetshop.service.UserService;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) context.getBean("userServiceImpl.java");
		userService.add(new User("vova", "w@W", "123"));

	}

}
