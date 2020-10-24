package week3.day1;

public class EmployeesInfo {

	int empId;
	String empName;
	static String compName;

	public EmployeesInfo(int empId, String empName, String compName) {

		this.empId = empId;
		this.empName = empName;
		this.compName = compName;

	}
	
	
	public static void getDetails() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		// ClassName Constructor()
		EmployeesInfo emp1 = new EmployeesInfo(100, "Hari","TestLeaf");
			
		EmployeesInfo emp2 = new EmployeesInfo(200, "Prasad","TestLeaf Software Solution Pvt Ltd");
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(compName);
		
		System.out.println("*********************************");
		
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(compName);
		
		getDetails();

	}

}
