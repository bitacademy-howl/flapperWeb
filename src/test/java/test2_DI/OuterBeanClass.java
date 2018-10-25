package test2_DI;

public class OuterBeanClass {
	private InnerBeanClass inner;
	
	public InnerBeanClass getInner() {
		return inner;
	}

	public void setInner(InnerBeanClass inner) {
		this.inner = inner;
	}
	
	public void printBalance(String accountNumber) {
		getInner().printBalance(accountNumber);
	}
	
}
