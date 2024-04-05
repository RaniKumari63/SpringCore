package com.suchiit.pojo;

public class Test {
private String name;
private int age;
public Test(String name) {
	super();
	this.name = name;
}
private String email;
@Override
public String toString() {
	return "Test [name=" + name + ", age=" + age + ", email=" + email + "]";
}

}
