package test2_DI;

public class Employee {
	private String name;
	private int age;
	private boolean gender;
	
	public Employee(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		
		 String gender = this.gender ? "남":"여";
		
		return String.format("Name : %s, Age : %d, gender : %s", name, age, gender);
	}
}
