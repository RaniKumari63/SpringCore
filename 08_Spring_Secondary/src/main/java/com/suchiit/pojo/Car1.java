package com.suchiit.pojo;

public class Car1 {
private String[] carnames;
private Engine1[] engine;
public String[] getCarnames() {
	return carnames;
}
public void setCarnames(String[] carnames) {
	this.carnames = carnames;
}
public Engine1[] getEngine() {
	return engine;
}
public void setEngine(Engine1[] engine) {
	this.engine = engine;
}

public void printCarData()
{
	for(String c:carnames)
	{
		System.out.println(c);
	}
	for(Engine1 e:engine)
	{
		System.out.println(e.getModelyear());
	}
}

}
