package Q3;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	abstract void calculateSalary();
	
	Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
  
}
