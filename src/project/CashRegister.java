package project;

import java.util.Scanner;

public class CashRegister {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		convertChange();
	}

	public static void convertChange() {
		int priceOfProduct, moneyProvided, change;

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter purchase price of product: $");
		priceOfProduct = (int) (kb.nextDouble() * 100);
		System.out.print("Enter the amount given by the customer: $");
		moneyProvided = (int) (kb.nextDouble() * 100);
		kb.close();

		// Insert program logic to compare
		if (moneyProvided > priceOfProduct) {
			System.out.println("The change is: " + ((moneyProvided - priceOfProduct) / 100));
			System.out.println("The customer should be given the change as follows: ");
			change = moneyProvided - priceOfProduct;
			// First test to see if Twenties work. *passed*
			int twenties = change / 2000;
			if (twenties > 0) {
				change = change % 2000;
				System.out.println(twenties + " $20 bill(s)");

			} else {

			}
		}
	}
}
