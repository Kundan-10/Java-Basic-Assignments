package Q4;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double  employeeSalary;
	private  Department department;

	Employee(int employeeId,String employeeName,double  employeeSalary,Department department){
	this.employeeId=employeeId;
	this.employeeName=employeeName;
    this.employeeSalary=employeeSalary;
    this.department=department;
		
	}
	
	Employee(){
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Object getDepartment() {
		return Department;
	}

	public void setDepartment(Object department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", Department=" + Department + "]";
	}
	
	
	
	
	 
}
