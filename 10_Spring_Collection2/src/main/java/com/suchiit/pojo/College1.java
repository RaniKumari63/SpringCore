package com.suchiit.pojo;

public class College1 {
private String cname;
private Student1 student;
public void setCname(String cname) {
	this.cname = cname;
}
public void setStudent(Student1 student) {
	this.student = student;
}
public void displayDetails()
{
	System.out.println("collegename:"+cname);
	System.out.println("Student information:");
	System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getSaddr());
}
}
