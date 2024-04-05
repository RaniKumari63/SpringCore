package com.suchiit.pojo;

import java.util.List;

public class College1 {
private String cname;
private List<Student1> student;
public void setCname(String cname) {
	this.cname = cname;
}
public void setStudent(List<Student1> student) {
	this.student = student;
}
public void displayDetails()
{
	System.out.println("collegename:"+cname);
	System.out.println("Student information:");
	for(Student1 student1:student)
	{
	System.out.println(student1.getSno()+"\t"+student1.getSname()+"\t"+student1.getSaddr());

	}}
}
