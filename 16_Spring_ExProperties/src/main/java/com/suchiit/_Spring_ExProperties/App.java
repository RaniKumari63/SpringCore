package com.suchiit._Spring_ExProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.pojo.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
    
    Test t=(Test)ap.getBean("t");
    t.printData();
    }
}
