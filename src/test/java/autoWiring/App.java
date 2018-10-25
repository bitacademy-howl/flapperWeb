package autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autoWiring.implement.EmployeeServiceImpl;
import autoWiring.interfaces.EmployeeService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("autoWiring/beans.xml");
		
		EmployeeService employee = (EmployeeService) context.getBean("employeeService");
		
		System.out.println(employee.getEmployeeDao());
	}

}
