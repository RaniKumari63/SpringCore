package com.suchiit.pojo;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
private Vector fruits;
private TreeSet crikerters;
private Hashtable cc;

public Vector getFruits() {
	return fruits;
}

public void setFruits(Vector fruits) {
	this.fruits = fruits;
}

public TreeSet getCrikerters() {
	return crikerters;
}

public void setCrikerters(TreeSet crikerters) {
	this.crikerters = crikerters;
}

public Hashtable getCc() {
	return cc;
}

public void setCc(Hashtable cc) {
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


