package Q2;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
 private int empLd;
 private String empName;
 private double salary;
 
 Employee(){
	 
 }
 
 Employee(int empLd,String empName,double salary){
	 this.empLd=empLd;
	 this.empName=empName;
	 this.salary=salary;
 }
 
 
@Override
public String toString() {
	return "Employee [empLd=" + empLd + ", empName=" + empName + ", salary=" + salary + "]";
}



public int getEmpLd() {
	return empLd;
}
public void setEmpLd(int empLd) {
	this.empLd = empLd;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public int compare(Employee p1, Employee p2) {
    if(p1.getSalary() > p2.getSalary()) {
    	return +1;
    }else if(p1.getSalary() < p2.getSalary()) {
    	return -1;
    }else {
    	return 0;
    }
}
 
 
 
}
