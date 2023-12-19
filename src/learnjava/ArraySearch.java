package learnjava;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("Enter 5 values");
		for (int i = 0; i < n.length; i++)
			n[i] = sc.nextInt();
		System.out.println("Enter the value to be searched");
		int key = sc.nextInt();
		if (search(n, key))
			System.out.println("element found");
		else
			System.out.println("element not found");
	}

	static boolean search(int[] n, int key) {
		for (int i = 0; i < n.length; i++) {
			if (key == n[i]) {
				return true;
			}
		}
		return false;
	}
}