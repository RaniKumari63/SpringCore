package com.suchiit._SpringComponent;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring1.xml");
		
	Car c=   (Car)ap.getBean("c");
	c.printCar();;
    }
}
