package com.suchiit.model;

public class Test {
	private static Test t;
private Test()
{
	System.out.println("Test Object ");
}
public static Test getInstance()
{  if(t==null)
{
	t=new Test();
	return t;
}
else
{
	
	return t;
}	
}


protected Object clone()throws CloneNotSupportedException
{
	throw new CloneNotSupportedException();
}
}
