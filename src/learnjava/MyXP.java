package learnjava;

public class MyXP {
	int clas;
	static int studentCount;

	public MyXP() {
		// TODO Auto-generated constructor stub
		clas = 1;
		studentCount = 15;
	}

	void addStudent() {
		studentCount++;
	}

	void addclass() {
		clas++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyXP java = new MyXP();
		MyXP python = new MyXP();

		java.addStudent();
		python.addStudent();

		java.addclass();
		python.addclass();

		System.out.println("Total students: " + studentCount);
		System.out.println("Python class count: " + python.clas);
		System.out.println("Java class count: " + java.clas);
	}
}
