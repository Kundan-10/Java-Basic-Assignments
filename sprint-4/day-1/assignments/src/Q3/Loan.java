package Q3;

public class Loan {
	
	private double Loan;
	
	private Loan() {
		
	}
	
	static Loan loann() {
		Loan ll=new Loan();
		return ll;
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
    
		
		if(employeeObj instanceof PermanentEmployee) {
		   
		    
		    return Loan=employeeObj.salary *0.15;
		}else {
			 return Loan=employeeObj.salary *0.10;
		}
	
	}
		
	}


