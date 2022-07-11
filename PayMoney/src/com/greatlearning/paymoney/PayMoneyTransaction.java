package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoneyTransaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		System.out.println("Enter the values of array");
		int[] transactions = new int[size];
		int totalTransaction = 0;
		int individualTransaction = 0;
		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
			totalTransaction += transactions[i];

		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noofTargets = sc.nextInt();
		while(noofTargets!=0) {
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			if (totalTransaction >= targetValue) {
				for (int j = 0; j < size; j++) {
					individualTransaction += transactions[j];
					if (individualTransaction >= targetValue) {
						System.out.println("Target has achieved after " + (j + 1) + " transactions");
						break;
					}
				}
			} else {
				System.out.println("Given Target didnt acheived");
			}
			noofTargets--;
		} 

		sc.close();
	}

}
