package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		
		
		// singleTone Test
		ApplicationContext context = new ClassPathXmlApplicationContext("scope/beans.xml");
		TextC textc;
		
		textc = (TextC)context.getBean("singleTone");
		
		textc.setMessage("singleTone");
		System.out.println(textc.getMessage());
		
		textc = (TextC)context.getBean("singleTone");
		System.out.println(textc.getMessage());
		
		
		// prototype Test
		// 호출 될 때마다 새로운 인스턴스를 생성하여 반환
		textc = (TextC)context.getBean("prototype");
		
		textc.setMessage("prototype");
		System.out.println(textc.getMessage());
		
		textc = (TextC)context.getBean("prototype");
		System.out.println(textc.getMessage());
		
		
		// scope = request : 새로운 리퀘스트가 발생할 때를 인지하고 요청에 의한 새로운 빈을 생성하는 스프링은 리퀘스트 스코프가 getbean() 메서드를 내부에 가지고 있으면 리퀘스트마다 새로운 빈이 생성된다.
		//                   하지만 동일한 리퀘스트 스코프라면 같은 빈이 사용된다.
		
		// scope = session : HTTP 세션마다 빈 인스턴스를 생성하는 웹 어플리케이션에서만 적용. 세션마다 새로운 빈 생성
		//                   단일 세션에서 접근하는 하나의 사용자만 있는 한 getBean()을 호출할 때마다 같은 빈 인스턴스를 반환
		//                   서로 다른 세션에서 하나의 사용자라면 새로운 빈 인스턴스 생성
		
		// scope = globalsession : 스프링을 사용하는 매번 새로운 포틀릿 세션을 생성하는 포틀릿 환경에서만 적용
		
		
	}

}
