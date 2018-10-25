package test2_DI;

public class InnerBeanClass {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printBalance(String accountNumber) {
		System.out.println(message + accountNumber);
	}
}
