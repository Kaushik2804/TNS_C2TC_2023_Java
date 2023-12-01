package learnjava;

public class Student10 {
	int rollno;
	String name;
	float fee;

	public Student10(int rollno, String name, float fee) {
		// TODO Auto-generated constructor stub
//		rollno = r; different local variable and instance variable for referencing
//		name = n;
//		fee = f;
		this.rollno = rollno;  //using this keyword for referencing instance variable.
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student10 s1 = new Student10(111, "Kaushik", 5000f);
		Student10 s2 = new Student10(112, "Eshan", 6000f);
		s1.display();
		s2.display();
	}

}
