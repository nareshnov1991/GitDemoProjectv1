package com.springhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	//https://www.tutorialspoint.com/spring/spring_hello_world_example.htm
	
public static void main(String[] args) {
	
	//spring IOC Container create the objects from xml file 
	
/*	Inversion of Control (IoC) means to create instances of dependencies 
	first and latter instance of a class (optionally injecting them through constructor), 
	instead of creating an instance of the class first and then the class instance 
	creating instances of dependencies.*/
	
	ApplicationContext context = new  ClassPathXmlApplicationContext("Bean.xml");
	HelloWorld hello = (HelloWorld) context.getBean("helloWorld"); // get the object of the HelloWorld Class. 
	hello.getMessage();
	
	
}
}
