package com.suchiit.pojo;

import javax.annotation.PostConstruct;

public class HelloWorld {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
@PostConstruct
public void init()
{
	System.out.println("intialization log");
}
}
