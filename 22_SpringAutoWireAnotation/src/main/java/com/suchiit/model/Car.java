package com.suchiit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Car {

	@Qualifier(value="e1")
	@Autowired()
private Engine engine;

public void printData()
{ 
	System.out.println("engine:"+engine);
}
}
