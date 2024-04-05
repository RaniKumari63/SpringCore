package com.suchiit._SpringFactoryMehtod;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.model.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
   
   Test t1=(Test) ap.getBean("t");
   Test t2=(Test) ap.getBean("t");
   System.out.println(t1);
   System.out.println(t2);
  Calendar c=(Calendar)ap.getBean("c");
  Calendar c1=(Calendar)ap.getBean("c");
  System.out.println(c==c1);
  System.out.println(c.getCalendarType());
    }
}
