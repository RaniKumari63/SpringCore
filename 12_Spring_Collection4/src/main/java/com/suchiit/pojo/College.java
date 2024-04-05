package com.suchiit.pojo;

import java.util.List;

public class College {
private String cname;
private List<Student> student;
public void setCname(String cname) {
	this.cname = cname;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public void displayDetails()
{
	for(Student s:student)
	{
		
		System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSaddr());
	}
}

}
