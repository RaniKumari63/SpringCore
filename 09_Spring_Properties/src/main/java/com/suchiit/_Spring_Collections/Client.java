package com.suchiit._Spring_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.pojo.Test;

public class Client {

	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
		Test t=(Test)ap.getBean("t");
		t.printData();
	}
}
