package learnjava;

import java.util.Scanner;

public class Market_things {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item no, item name, rate and quantity");
		double discount = 1;
		int item_no = sc.nextInt();
		String item_name = sc.next();
		int rate = sc.nextInt();
		int quantity = sc.nextInt();

		int price = rate * quantity;

		if (price >= 1000 && price < 2000) {
			discount = price * 0.1;
		} else if (price >= 2000 && price < 3000) {
			discount = price * 0.15;
		} else if (price >= 3000 && price < 5000) {
			discount = price * 0.2;
		} else {
			discount = price * 0.25;
		}
		double net_price = price - discount;
		System.out.println("Item details:");
		System.out.printf("\nItem no : %d", item_no);
		System.out.printf("\nItem name : %s", item_name);
		System.out.printf("\nPrice : %d", price);
		System.out.printf("\nDiscount : %.2f", discount);
		System.out.printf("\nNet price : %.2f", net_price);
	}
}
