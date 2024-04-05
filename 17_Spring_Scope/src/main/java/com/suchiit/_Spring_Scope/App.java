package com.suchiit._Spring_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.model.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
        HelloWorld helloworld=(HelloWorld)context.getBean("helloWorld");
        HelloWorld helloworld1=(HelloWorld)context.getBean("helloWorld");
        
        
    }
}
