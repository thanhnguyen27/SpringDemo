package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
public class BeanFactoryWithFileSystemResource {
    public static void main(String... args) {
    	Resource res = new FileSystemResource("src/main/resources/spring-app.xml");
    	BeanFactory factory = new XmlBeanFactory(res); 
    	Entitlement ent = (Entitlement)factory.getBean("entitlement");
        System.out.println(ent.getName());
    } 
}