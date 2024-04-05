package com.suchiit.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	@Bean
	@Scope("prototype")
	public HelloWorld getBeanInfo()
	{
		HelloWorld h=new HelloWorld();
		h.setMessage("Welcome boss");
		return h;
	}

}
