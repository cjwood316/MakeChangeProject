package project;

import java.util.Scanner;

public class CashRegister {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		convertChange();
	}

	public static void convertChange() {
		int priceOfProduct, moneyProvided, change;
		int twenties, tens, fives, ones;
		double quarters, dimes, nickels, pennies;

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter purchase price of product: $");
		priceOfProduct = (int) (kb.nextDouble() * 100);
		System.out.print("Enter the amount given by the customer: $");
		moneyProvided = (int) (kb.nextDouble() * 100);
		kb.close();
	}

}
