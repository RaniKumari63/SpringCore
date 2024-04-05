package com.suchiit.pojo;

public class College {
String name;
Student stu;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student getStu() {
	return stu;
}
public void setStu(Student stu) {
	this.stu = stu;
}
public void displayDetails()
{
	System.out.println("collegename:"+name);
	System.out.println("Student information:");
	
	System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());

}
public College(Student stu) {
	super();
	this.stu = stu;
}

}
