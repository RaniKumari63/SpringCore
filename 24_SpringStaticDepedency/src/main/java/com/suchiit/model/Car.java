package com.suchiit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car {
	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Car.name = name;
	}
	public static void printCar()
	{
		System.out.println("Hello"+name);
	}
}
