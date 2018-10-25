package autoWiring.implement;

import autoWiring.interfaces.EmployeeDao;
import autoWiring.interfaces.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao = null;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
//	public EmployeeServiceImpl(EmployeeDao employeeDao) {
//		super();
//		this.employeeDao = employeeDao;
//	}
}
