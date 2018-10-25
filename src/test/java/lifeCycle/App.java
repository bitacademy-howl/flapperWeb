package lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		해당 빈이 두번 정의 되어 있기 때문에 처음 설정으로부터 불러오면서 빈 객체들이 생성되고 그 즉시 초기화 콜백을 수행한다.
//		이후 두번째 빈도 동일한 과정을 거쳐서 생성된 후 마지막으로 bean property에 init-method 속성으로 지정된 메서드를 한번더 호출한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle/beans.xml");
//		BeanC bean1 = (BeanC) context.getBean("init-method");
		
//		BeanC bean2 = (BeanC) context.getBean("default");
		
//		빈의 소멸자 메서드는 컨테이너로부터 빈이 제거되는 순간 바로 호출된다.
		
		BeanC bean1 = (BeanC) context.getBean("init-method");
		BeanC bean2 = (BeanC) context.getBean("default");
		
//		bean1.myCleanUp();  // 이처럼 불러올 수도 있고...
		
		((AbstractApplicationContext) context).close();
		
//		자원을 점유하는 file 이나 DB connection 같은.... 개체가 사라질 때에는 반환해야 하는 자원들에 대한 메서드를 넣어두면 좋을 것 같다.
	}

}
