package learnjava;

class Adder1 {
	static int add1(int a, int b) {
		return a + b;
	}

	static double add(double d, double e) {
		return d + e;
	}
}

public class MO_Example1 {

	public static void main(String[] args) {
		// changing data type of return
		System.out.println(Adder1.add1(11, 11));
		System.out.println(Adder1.add(11.11, 11.11));
	}

}
