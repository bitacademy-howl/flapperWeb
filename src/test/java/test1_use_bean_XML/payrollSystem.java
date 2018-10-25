package test1_use_bean_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class payrollSystem {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("autoWiring/beans.xml");
		
		EmployeeService empService = (EmployeeServiceImpl) context.getBean("empServiceBean");
		
		System.out.println("Unique Employee ID : " + empService.generateEmployeeId());
	}

}
