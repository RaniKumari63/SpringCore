package com.suchiit.pojo;

public class Test {
private String name;
private int age;
private String email;
public void setAge(int age) {
	this.age = age;
}
public void setEmail(String email) {
	this.email = email;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public void printData()
{
	System.out.println("name"+name);

	System.out.println("age"+age);

	System.out.println("email"+email);
}
}
