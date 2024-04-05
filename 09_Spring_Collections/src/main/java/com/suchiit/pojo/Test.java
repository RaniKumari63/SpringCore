package com.suchiit.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
private List fruits;
private Set crikerters;
private Map cc;
public List getFruits() {
	return fruits;
}
public void setFruits(List fruits) {
	this.fruits = fruits;
}
public Set getCrikerters() {
	return crikerters;
}
public void setCrikerters(Set crikerters) {
	this.crikerters = crikerters;
}
public Map getCc() {
	return cc;
}
public void setCc(Map cc) {
	this.cc = cc;
}
public void printData()
{
	System.out.println("Fruits..........");
	for(Object f:fruits)
	{
		System.out.println(f);
	}
	System.out.println("criketer");
	for(Object c:crikerters)
	{
		System.out.println(c);
	}
	Set keys=cc.keySet();
	for(Object  key:keys)
		
	{
		System.out.println("country:"+key+cc.get(key));
	}
	}
}


