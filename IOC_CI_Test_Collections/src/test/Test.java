package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Question;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("resources/applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Question question = (Question)beanFactory.getBean("q");
		question.displayInfo();
	}
}
