package lifeCycle;

import org.springframework.beans.factory.InitializingBean;

public class BeanC implements InitializingBean{
	
	public BeanC() {
		super();
		System.out.println("생성자 호출");
	}
	
	public Long genarateID() {
		return System.currentTimeMillis();
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// 빈의 초기화 콜백 메서드
		System.out.println("InitializingBean에서 오버라이드 된 초기화 콜백 메서드 호출");
	}
	
	public void myInit() {
		System.out.println("myInit() 호출");
	}
	
	public void myCleanUp() {
		System.out.println("소멸자 호출");
	}
	
	

}
