package com.suchiit._SprinSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.College;
import com.suchiit.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\suchiit\\config\\spring.xml"));
    Student st=(Student)factory.getBean("s");
  
  College c=(College)factory.getBean("c");
    System.out.println( st.getSno()+"\t"+ st.getSadd()+"\t"+ st.getSname());
    Student st2=(Student)factory.getBean("s1");
    System.out.println( st2.getSno()+"\t"+ st2.getSadd()+"\t"+ st2.getSname());
    Student st1=c.getStu();
    System.out.println(c.getName()+"\t"+st1.getSno()+"\t"+st1.getSname()+"\t"+st1.getSadd());
   
    
    }
}
