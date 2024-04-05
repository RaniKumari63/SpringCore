package com.suchiit.model;

public class Bus {
private Engine engine;
public Bus(Engine engine)
{
	this.engine=engine;
	
}


  public Bus() { System.out.println("bus"); }
 
public void printData()
{
	System.out.println("Bus eng mdelyear:="+engine.getModelyear());
}
public void setEngine(Engine engine) {
	this.engine = engine;

}
}
