package com.suchiit._Springdependency;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.model.Car;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    { 
       ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring1.xml");
  
    
    }
}
