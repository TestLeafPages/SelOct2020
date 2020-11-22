package week3.day1;

public class StundentInfo {

	public void getStudentDetails(String name) {

		System.out.println("student details based on given name");
		
		

	}
	
	
	public void getStudentDetails(int id) {

		System.out.println("student details based on given ID");
		
		

	}

	
	public void getStudentDetails(String name,int phNo) {

		System.out.println("student details based on given name and phone number");

	}
	
	
	public void getStudentDetails(int id,String eMail) {

		System.out.println("student details based on given id and email");

	}
	
	

	public static void main(String[] args) {
		StundentInfo si = new StundentInfo();

		si.getStudentDetails(100);

	}

}
