package test2_DI;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao = null;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@ Override
	public void setEmployeeDao() {
		this.employeeDao = new EmployeeDaoImpl();
	}

	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@ Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}

//  오버라이딩 되어야하는 인터페이스 정의 메서드....
//	인자를 한개 가지는....
	
//	@Override
//	public void setEmployeeDao(EmployeeDao employeeDao) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
