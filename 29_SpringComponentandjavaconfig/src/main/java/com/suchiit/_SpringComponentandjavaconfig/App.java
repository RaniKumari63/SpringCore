package com.suchiit._SpringComponentandjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suchiit.model.Alien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Alien.class);
        Alien a1=context.getBean(Alien.class);
        a1.show();
    }
}
