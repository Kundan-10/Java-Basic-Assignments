package Q3;

public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	
	private int hourlyWages;
	
	
	TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyWages){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		this.calculateSalary();
	}
	

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	@Override
	void calculateSalary() {
		
		salary =hoursWorked * hourlyWages;
		
	}
	
	
    
}
