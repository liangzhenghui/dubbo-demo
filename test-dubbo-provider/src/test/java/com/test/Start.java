package com.test;

import org.apache.log4j.PropertyConfigurator;

public class Start {
	/**
	 * 	可以通过spring的方式在web.xml加载log4j
	 * <context-param> 
		    <param-name>log4jConfigLocation</param-name> 
		    <param-value>WEB-INF/classes/log4j.properties</param-value> 
		</context-param> 
		下面是通过java的方式加载
	 */
	static{  
        PropertyConfigurator.configure("src/main/resources/log4j.properties");  
    }  
	public static void main(String[] args) {
		com.alibaba.dubbo.container.Main.main(args);
	}

}
