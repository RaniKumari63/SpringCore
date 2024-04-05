package com.suchiit.pojo;

public class HelloWorld {
private String message;
private String gender;
public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "HelloWorld [message=" + message + ", gender=" + gender + "]";
}



}
