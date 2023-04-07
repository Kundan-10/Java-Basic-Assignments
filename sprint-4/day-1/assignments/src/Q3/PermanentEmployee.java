package Q3;

public   class  PermanentEmployee extends  Employee{
	private double basicPay;
	
	
	
	PermanentEmployee(int employeeid,String employeeName,double basicPay){
		this.basicPay=basicPay;
		this.calculateSalary();
	}
	
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateSalary() {
		
		salary =basicPay- (basicPay*0.12);
		
	}


	public double getBasicPay() {
		return basicPay;
	}



	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}




	




	
    
}
