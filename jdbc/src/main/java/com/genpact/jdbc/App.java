package com.genpact.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("conf.xml");
        Empdao empdao=(Empdao) applicationContext.getBean("empdao");
        //Employee employee=new Employee(2,"Ansh","BLR");
        //empdao.saveEmp(employee);
     
        empdao.deleteEmp(1);
        empdao.getAllEmp();
    }
}
