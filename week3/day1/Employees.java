package week3.day1;

public class Employees {

	int empId;
	String empName;

	public Employees() {
		this(100,"Hari");
		System.out.println("default constructor");
	}
	
	public Employees(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
		System.out.println("parameterized constructor");
				
		}


	public static void main(String[] args) {
		// ClassName Constructor()
		Employees emp = new Employees();

		System.out.println(emp.empId);
		System.out.println(emp.empName);

	}

}
