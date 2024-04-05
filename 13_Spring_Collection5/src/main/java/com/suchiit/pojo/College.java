package com.suchiit.pojo;

import java.util.List;
import java.util.Set;

public class College {
private String cname;
private List<Student> student;
private List<String> faculties;
private Set<String>courses;
public List<String> getFaculties() {
	return faculties;
}
public void setFaculties(List<String> faculties) {
	this.faculties = faculties;
}
public Set<String> getCourses() {
	return courses;
}
public void setCourses(Set<String> courses) {
	this.courses = courses;
}
public String getCname() {
	return cname;
}
public List<Student> getStudent() {
	return student;
}
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
	
	System.out.println("Faculty Information");
	for(String s:faculties)
	{
		
		System.out.println(s);
	}
	System.out.println("Course Information");
	for(String c:courses)
	{System.out.println(c);
		
	}
}

}
