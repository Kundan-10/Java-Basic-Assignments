package Q1;

public class Car {
	
	private int numberOfPassenger;
	private int numberOfKms;
	
	Car(){
		
	}
	
	public int kms() {
		return numberOfKms;
	}
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}

}
