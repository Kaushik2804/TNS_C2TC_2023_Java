package learnjava;

class Employee{
	int empId;
	String empName;
	static String companyName = "TCS";
	static void valueChange() {
		companyName = "DataFlair";
	}
	
	public Employee(int id, String name) {
		// TODO Auto-generated constructor stub
		empId = id;
		empName = name;
	}
	
	void display() {
		System.out.println(empId+" "+empName+" "+companyName);
	}
}

public class Demo_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.valueChange();
		
		Employee e1 = new Employee(218, "Kushal");
		Employee e2 = new Employee(635, "Bhumika");
		Employee e3 = new Employee(147, "Renuka");
		
		e1.display();
		e2.display();
		e3.display();
	}

}
