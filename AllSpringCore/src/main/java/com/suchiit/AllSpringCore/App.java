package com.suchiit.AllSpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.suchiit.pojo.Hello;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	Resource r=new ClassPathResource("\\com\\suchiit\\config\\spring.xml");
        BeanFactory factory=new XmlBeanFactory(r);
        Hello h=(Hello)factory.getBean("h");
        System.out.println(h.getMessage());
        System.out.println(h.toString());
    }
}
