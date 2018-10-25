package autoWiring.interfaces;


public interface EmployeeService {
	public void setEmployeeDao(EmployeeDao employeeDao);
	public EmployeeDao getEmployeeDao();
}
