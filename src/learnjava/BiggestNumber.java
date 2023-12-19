package learnjava;

import java.util.*;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a, b & c");
		int a = s.nextInt(); //10
		int b = s.nextInt(); //20
		int c = s.nextInt(); //30

		int result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(c);
	}

}
