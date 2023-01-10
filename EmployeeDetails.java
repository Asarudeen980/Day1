package day1_datatypes;

public class EmployeeDetails {
	public static void main(String[]args) {
		String employeeName="Ram";
		int employeeId=1926;
		String employeeRole="Developer";
		long employeeContactNumber=9934346767l;
		String employeeEmailId="ramkuma2022@gmail.com";
		String employeeDateOfBirth="08/08/1999";
		boolean employeeIsMale=true;
		char employeeInitial='R';
		float employeeSalary=25000.500f;
		double employeeAccBalance=55000.000000045d;
		float employeeHeight=5.5f;
		String employeeBloodGroup="A1 +ve";
		String employeeLocation="Chennai";
		boolean employeeIsPresent=true;
		
		System.out.println("Employee Name :"+employeeName+" || Employee Initial :"+employeeInitial+" || Employee Id :"+employeeId);
		System.out.println("Employee Role :"+employeeRole+" || Employee Salary :"+employeeSalary+" || Employee Acc Balance :"+employeeAccBalance);
		System.out.println("Employee Contact Number :"+employeeContactNumber+" || Employee Blood Group :"+employeeBloodGroup+" || Employee Location :"+employeeLocation);
		System.out.println("Employee Email ID :"+employeeEmailId+" || Employee Date Of Birth:"+employeeDateOfBirth+" || Employee Is Male :"+employeeIsMale);
	}

}
