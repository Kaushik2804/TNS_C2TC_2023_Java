package learnjava;

import java.util.Scanner;

public class Circle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double PI = 3.14;
		System.out.println("Enter radius=");
		double radius = sc.nextDouble();
		
		double area = PI * radius * radius;
		System.out.println("Area = "+area+"sqcm");
	}

}
