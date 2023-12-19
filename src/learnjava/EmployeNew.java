package learnjava;

class Emp{
	int empNo;
	String empName;
	double empSalary;

	void setDetails(int empNo,String empName,double empSalary) {
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	void getDetails() {
		System.out.println("**Employee Details**");
		System.out.println("Employee number : "+empNo);
		System.out.println("Employee name : "+empName);
		System.out.println("Employee salary : $"+empSalary);
	}
}

public class EmployeNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.setDetails(111,"Kaushik Panchal",5000);  // if setDetails is not called then null values is assigned for string types and 0 assigned for the integer values
		e.getDetails();
	}
}
