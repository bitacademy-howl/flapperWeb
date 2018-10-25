package test2_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App1_type_index {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("test2_DI/beans.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		
		System.out.println("Employee : " + employee);
		System.out.println("Emp service 객체 : " + employeeService);
		System.out.println("Emp.empdao : " + employeeService.generateEmployeeId());
		
		
		
//		세터호출로 값 지정
		Employee emp2 = (Employee) context.getBean("employee2");
		
		System.out.println(emp2);
		
//		세터 주입 (제네릭<컬렉션> 주입)
		User user = (User) context.getBean("user");
		
		System.out.println(user.getLists());
		System.out.println(user.getSets());
		System.out.println(user.getMaps());
		
		OuterBeanClass outer = (OuterBeanClass) context.getBean("outerBean");
		
		outer.printBalance("15000");
		
		
//		bean 상속은 일단 개념만 잡고 제끼자
//		bean 상속은 <bean 태그의 parent 속성>을 통해 정의할 수 있고, 이는 클래스 상속과는 개념이 다른 객체간 상속이므로 (bean 은 객체),
//		즉 데이터를 상속받겠다는 의미이다....
		
//		추상화 상속은 템플릿 상속이라고도 하며
//		인스턴스 화 할 수 없고 자식에게 정의만 해주는 용도.
//		bean 태그내 abstract="true" 속성을 이용해 상속.
//		추상메서드와 같이 상속받은 자식bean 을 통해서만 생성 가능.
//		
	}
}
