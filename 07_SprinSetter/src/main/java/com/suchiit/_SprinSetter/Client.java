package com.suchiit._SprinSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suchiit.pojo.College;
import com.suchiit.pojo.College1;
import com.suchiit.pojo.Student;
import com.suchiit.pojo.Student1;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("\\com\\suchiit\\config\\spring2.xml"));
    Student1 st=(Student1)factory.getBean("s");
  
  College1 c=(College1)factory.getBean("c");
    System.out.println( st.getSno()+"\t"+ st.getSaddr()+"\t"+ st.getSname());
 c.displayDetails();
    
    }
}
