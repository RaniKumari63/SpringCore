package com.suchiit._SpringCoreEx2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.HelloWorld1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   //finding  xml and loading xml
       BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\suchiit\\config\\spring.xml"));
   //create helloworld class object
       
       HelloWorld1 hw=(HelloWorld1)factory.getBean("h");
    HelloWorld1 hw1=(HelloWorld1)factory.getBean("h");
   //even we call helloword object multiple time ,container only creates single  same object and return multiple times
    
    hw.hello();
   System.out.println(hw.add(10, 20));
   System.out.println(hw==hw1);
    
    
    }
}
