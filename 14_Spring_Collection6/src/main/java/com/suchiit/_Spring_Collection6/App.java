package com.suchiit._Spring_Collection6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suchiit.pojo.SpringBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext ap=new ClassPathXmlApplicationContext("\\com\\suchiit\\config\\spring.xml");
   SpringBean s=(SpringBean)ap.getBean("sb");
   SpringBean s1=(SpringBean)ap.getBean("sb");
   SpringBean s2=(SpringBean)ap.getBean("sb");
   SpringBean s3=(SpringBean)ap.getBean("sb");
    }
}
