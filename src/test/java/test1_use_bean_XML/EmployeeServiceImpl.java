package test1_use_bean_XML;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	
//	public EmployeeServiceImpl(EmployeeDao employeeDao) {
//		this.employeeDao = employeeDao;
//	}
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
	
}
