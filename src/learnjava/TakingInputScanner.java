package learnjava;

import java.util.Scanner;

public class TakingInputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter a number:");
//		int a = sc.nextInt();
//
//		System.out.println("Enter second number:");
//		int b = sc.nextInt();
//
//		int c = a + b;

		System.out.println("Enter a string:");

		String s = sc.nextLine();

//		System.out.println("Sum is " + c);
		System.out.println("The string is " + s);
	}
}
