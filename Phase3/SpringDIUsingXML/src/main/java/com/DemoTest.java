package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
//		Employee emp=(Employee) bf.getBean("emp1");
//             emp.display();
//             Employee emp2=(Employee) bf.getBean("emp1");
//             emp2.display();
//        Employee emp1=(Employee)bf.getBean("emp2");
//         emp.display();
//         Employee emp4=(Employee) bf.getBean("emp2");
//         emp4.display();
		Employee emp=(Employee)bf.getBean("emp1");
		System.out.println(emp);
	}

}
