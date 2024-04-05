package com.suchiit._SprinSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.College;

import com.suchiit.pojo.Student;


/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      //  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\suchiit\\config\\spring.xml"));
        ApplicationContext factory=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring5.xml");
    
  College c=(College)factory.getBean("clg");
  
 c.displayDetails();
    
    }
}
