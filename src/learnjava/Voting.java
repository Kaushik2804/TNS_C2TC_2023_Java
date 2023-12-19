package learnjava;

import java.util.*;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter the age : ");
		int age = s.nextInt();

		if (age < 0)
			System.out.println("Invalid age");
		else if (age > 18)
			System.out.println("Age is major");
		else
			System.out.println("Age is minor");
	}

}
