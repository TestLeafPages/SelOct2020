package week1.day2;

import week1.day1.Car;

public class EmployeeInfo {
	
	
	public void printEmpDetails() {
		
		System.out.println("Hari");

	}
	
	  public String getEmployeeName() {
	  
	  return "Prasad";
	  
	  }
	  
	  public long getEmployeePhone(int id,String name) {
		  
		  if(id == 100) {
			  return 8884151543L; 
		  }
		  else
		  return 99999999999L;
		  

	}
	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo();
		
		ei.printEmpDetails();
		
		String name = ei.getEmployeeName();
		
		System.out.println(name);
		
		long employeePhone = ei.getEmployeePhone(200,"Hari");
		
		System.out.println(employeePhone);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
