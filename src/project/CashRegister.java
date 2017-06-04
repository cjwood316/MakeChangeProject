package project;

import java.util.Scanner;

public class CashRegister {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		convertChange();
	}

	public static void convertChange() {
		double priceOfProduct, moneyProvided, change;

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter purchase price of product: $");
		priceOfProduct = (kb.nextDouble() * 100);
		System.out.print("Enter the amount given by the customer: $");
		moneyProvided = (kb.nextDouble() * 100);
		kb.close();

		// Insert program logic to compare
		if (moneyProvided > priceOfProduct) {
			System.out.println("The change is: $" + ((moneyProvided - priceOfProduct) / 100));
			System.out.println("The customer should be given the change as follows: ");
			change = moneyProvided - priceOfProduct;
			// First test to see if Twenties work. *passed*
			int twenties = (int)change / 2000;
			if (twenties > 0) {
				change = change % 2000;
				System.out.println(twenties + " $20 bill(s)");
			}
			// Second test checks for tens. *passed*
			int tens = (int)change / 1000;
			if (tens > 0) {
				change = change % 1000;
				System.out.println(tens + " $10 bill(s)");
			}
			// Checks for remainder of fives *passed*
			int fives = (int)change / 500;
			if (fives > 0) {
				change = change % 500;
				System.out.println(fives + " $5 bill(s)");
			}
			// Checks for remainder of ones *passed*
			int ones = (int)change / 100;
			if (ones > 0) {
				change = change % 100;
				System.out.println(ones + " $1 bill(s)");
			}
			double quarters = change / 25;
			if (quarters > 0) {
				change = change % 25;
				System.out.println((int)quarters + " quarter(s)");

			} else {

			}
		}
	}

}
