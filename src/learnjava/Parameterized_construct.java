package learnjava;

public class Parameterized_construct {
	int id;
	String name;
	
	public Parameterized_construct(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_construct pc = new Parameterized_construct(11, "Kaushik");
		Parameterized_construct pc1 = new Parameterized_construct(12, "Ansh");
		pc.display();
		pc1.display();
	}

}
