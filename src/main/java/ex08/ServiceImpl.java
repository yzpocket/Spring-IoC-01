package ex08;

public class ServiceImpl implements Service {
	//property
	private Emp emp;
	
	//setter,getter
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}


	@Override
	public void test1() {
		System.out.printf("Name:%s%nDept:%s%nSalary:%s%n", emp.getName(), emp.getDept(), emp.getSalary());
	}

}
