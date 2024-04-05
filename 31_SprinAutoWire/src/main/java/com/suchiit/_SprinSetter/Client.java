package com.suchiit._SprinSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.HelloWorld;
import com.suchiit.pojo.SpringConfig;



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
        ApplicationContext factory=new AnnotationConfigApplicationContext(SpringConfig.class);
    
 HelloWorld hello=(HelloWorld)factory.getBean(HelloWorld.class);
 HelloWorld hello1=(HelloWorld)factory.getBean(HelloWorld.class);
 System.out.println(hello.getMessage());
 System.out.println(hello);
 System.out.println(hello1);  
    }
}
