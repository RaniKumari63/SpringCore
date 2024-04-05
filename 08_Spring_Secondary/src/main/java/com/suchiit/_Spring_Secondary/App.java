package com.suchiit._Spring_Secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.pojo.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String files[]=new String[] {"\\com\\suchiit\\config\\car.xml","\\com\\suchiit\\config\\Engine.xml"};
       // ApplicationContext ap=new ClassPathXmlApplicationContext(files);
     ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
        Car c=(Car)ap.getBean("c");
        c.printData();
    }
}
