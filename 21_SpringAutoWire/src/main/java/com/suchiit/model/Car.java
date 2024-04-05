package com.suchiit.model;

public class Car {
private Engine engine;
public void setEngine(Engine engine) {
	this.engine = engine;
}

public void printData()
{
	System.out.println("engine:"+engine);
}
}
