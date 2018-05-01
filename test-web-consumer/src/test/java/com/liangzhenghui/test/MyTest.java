package com.liangzhenghui.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cl.user.servicei.UserService;
import com.liangzhenghui.service.DemoService;

public class MyTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring/*.xml" });
		DemoService service = (DemoService) context.getBean("demoService");
		service.sing();
	}
}
