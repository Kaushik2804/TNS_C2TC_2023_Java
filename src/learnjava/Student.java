package learnjava;

public class Student {
	int roll_no;
	String name;
	
	void insert(int r, String n) {
		roll_no = r;
		name = n;
	}

	void display_info() {
		System.out.println(roll_no +" "+name );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		s1.insert(111, "Kaushik");
		s2.insert(112, "Ansh");
		s1.display_info();
		s2.display_info();
	}

}
