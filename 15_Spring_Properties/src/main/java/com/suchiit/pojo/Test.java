package com.suchiit.pojo;

import java.util.Properties;
import java.util.Set;

public class Test {
private Properties props1;


public void setProps1(Properties props1) {
	this.props1 = props1;
}


public void printData()
{
	Set keys=props1.keySet();
	for(Object key:keys)
	{
		System.out.println(key+":"+props1.getProperty(key.toString()));
	}
}

}
