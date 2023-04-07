package Q1;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {


		if(numberOfPassenger<=3) {
			Car h=new HatchBack();
			
			h.setNumberOfPassenger(numberOfPassenger);
			return h;
		}else {
			Car s=new Sedan();
			
			s.setNumberOfKms(numberOfKMs);
			return s;
		}
	
		
	}
	public  int calculateBill(Car car) {
		
		int fare;
		
		if(car instanceof HatchBack) {
			HatchBack h=(HatchBack)car;
		   int kms=h.getNumberOfKms();
		 fare=kms * h.farePerKm;
	
		}
		else {
			Sedan s=(Sedan)car;
			int kms=s.getNumberOfKms();
		 fare=kms * s.farePerKm;
		
			 
		}
		return fare;
	
	
	}

}
