package com.gen.com.gen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
   AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
   
   Manager manager=annotationConfigApplicationContext.getBean(Manager.class);

   
   manager.calMeeting();
  
  annotationConfigApplicationContext.close();
   
   
   
   
  }
}
