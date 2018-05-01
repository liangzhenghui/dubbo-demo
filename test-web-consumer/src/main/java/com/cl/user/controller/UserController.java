package com.cl.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cl.user.servicei.UserService;
import com.liangzhenghui.service.DemoService;

@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="demoService")
	private DemoService demoService;
	
	@RequestMapping("/hello/test/world")
	public void sayHello(){
		System.out.println(userService.sayHello()+"**************************");
	}
	
	@RequestMapping("/hello/test/demo")
	public void demoTest(){
		demoService.sing();
		System.out.println("demo**************************");
	}
}
