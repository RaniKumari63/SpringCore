package com.suchiit._Spring_Secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.pojo.Car1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring1.xml");
	
	Car1 c1=(Car1)ap.getBean("c");
	c1.printCarData();
	}

}
