package com.suchiit._Spring_Construcotr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\suchiit\\config\\spring.xml"));
    
    Test t=(Test)factory.getBean("t");
    t.printData();
    }
}
