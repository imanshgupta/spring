package com.org.practive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("AppConfiguration.xml");
    	
    	HellowWorldService hellowWorldService=context.getBean(HellowWorldService.class);
    	
    	hellowWorldService.sayhellow();
    	
    	abc abc=(abc)context.getBean("bean2");
    	System.out.println(abc);
    	
    	context.close();
    	
    
  }
}
