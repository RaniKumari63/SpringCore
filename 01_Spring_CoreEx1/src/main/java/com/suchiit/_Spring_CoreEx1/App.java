package com.suchiit._Spring_CoreEx1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.suchiit.pojo.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Resource r=new ClassPathResource("\\com\\suchiit\\config\\spring.xml");
        BeanFactory factory=new XmlBeanFactory(r);
        HelloWorld h=(HelloWorld)factory.getBean("h");
        System.out.println(h.getMessage());
        System.out.println(h.toString());
    }
}
