package com.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AOPTest {
	
	public static void main(String[] args){
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//		Hello obj=(Hello) context.getBean("Hello");
//		obj.getMessage();
		
		
		Resource resource =new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
//		Hello obj=(Hello)factory.getBean("Hello");
//		obj.getMessage();
		
		
		
	}
	

}
