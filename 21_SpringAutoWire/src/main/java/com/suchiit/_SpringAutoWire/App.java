package com.suchiit._SpringAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.model.Bus;
import com.suchiit.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    { 
	     //  ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
		 //ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring1.xml");
		// ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring2.xml");
		 ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring3.xml");
	    //Car c=(Car)ap.getBean("c");
	  //  c.printData();
	    Bus b=(Bus)ap.getBean("b");
	   b.printData();
	    }
	}
