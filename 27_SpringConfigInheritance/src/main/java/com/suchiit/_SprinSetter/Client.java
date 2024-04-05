package com.suchiit._SprinSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.Employee;


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
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\suchiit\\config\\spring5.xml"));
    
 Employee emp=(Employee)factory.getBean("emp");
 emp.display();
    }
}
