package Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Employee;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("resources/applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee) beanFactory.getBean("emp");
		employee.displayInfo();
	}
}
