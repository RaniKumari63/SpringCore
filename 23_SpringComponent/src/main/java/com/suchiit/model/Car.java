package com.suchiit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Car {
	@Qualifier(value="e2")
  @Autowired
	public Engine engine;
  public void printData()
  {
	  System.out.println("engine"+engine.getEngname());
  }
}
