package com.suchiit.model;

import org.springframework.beans.factory.annotation.Required;

public class Car {
private String carname;
private Engine engine;
public String getCarname() {
	return carname;
}
@SuppressWarnings("deprecation")
@Required
public void setCarname(String carname) {
	this.carname = carname;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void printData()
{
	
	System.out.println(carname);
	System.out.println(engine.getModelyear());
}

}
