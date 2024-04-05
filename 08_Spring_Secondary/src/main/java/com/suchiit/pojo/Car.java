package com.suchiit.pojo;

public class Car {
	private Engine engine;
	private String carname;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
public void printData()
{
	System.out.println("carname"+carname);
	System.out.println("modelyear"+engine.getModelyear());
}
}
