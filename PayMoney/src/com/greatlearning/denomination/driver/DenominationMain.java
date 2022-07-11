package com.greatlearning.denomination.driver;

import java.util.Scanner;

import com.greatlearning.denomination.service.InsertionSorting;

public class DenominationMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denominationValues = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			denominationValues[i] = sc.nextInt();
		}
		// 50 40 20 10 5
		// 25
		// 20<25
		System.out.println("Enter the amount you want to pay");
		int amountToPay = sc.nextInt();
		if (amountToPay > 0) {
			InsertionSorting.insertionSort(denominationValues);
			for (int i = size - 1; i >= 0; i--) {
				if (denominationValues[i] <= amountToPay) {
					int k = amountToPay / denominationValues[i];
					System.out.println("Payment of " + denominationValues[i] + ":" + k);
					amountToPay -= (denominationValues[i]*k);
				} else {
					continue;
				}
			}
		} else {
			System.out.println("Given Amount cannot be Paid");
		}
		sc.close();
	}

}
