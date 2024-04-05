package com.suchiit.pojo;

public class Employee {
private int eno;
private String ename;
private int sal;
private String city;
private String hno;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}
public void display()
{
	System.out.println(eno);
	System.out.println(ename);
	System.out.println(sal);
	System.out.println(city);
}
}
