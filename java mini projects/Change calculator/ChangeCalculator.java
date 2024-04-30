package com.beginnerutils;

import java.util.Scanner;
public class ChangeCalculator {
	public static void changeCalculator() {
	// this program uses the FCFA of West African states
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount charged and the amount"
				+ "given separated by a white space");
		int amountCharged = input.nextInt();
		int amountGiven = input.nextInt();
		input.close();
		
		if(amountCharged <= 0 || amountGiven <= 0)
			System.out.println("The amounts must be greater than zero!");
		
		if(amountGiven == amountCharged)
			System.out.println("No change required!");
		
		int change = amountGiven - amountCharged;
		
		int[] bills = {10000, 5000, 2000, 1000, 500};
		int[] coins = {100, 50, 25};
		int changeCount = 0;
		int[] billCount = new int[5];
		int[] coinCount = new int[3];
		if(change > 0) {
			if(change > 500) {
				for(int i = 0; i < 5; i++) {
					changeCount += bills[i];
					billCount[i]++;
					if(changeCount > change) {
						changeCount -= bills[i];
						billCount[i]--;
					}
				}
			}
			
			for(int j = 0; j < 3; j++) {
				for(int i = 0; changeCount < change; i++) {
					if(changeCount == change)
						break;
					changeCount += coins[j];
					coinCount[j]++;
					if(changeCount > change) {
						changeCount -= coins[j];
						coinCount[j]--;
						break;
					}
				}
			}
		}else {
			System.out.println("The amoung given must be >= amount charged!");
			System.exit(0);
		}
		
		System.out.println("Bills and/or coins required to make up the change: ");
		for ( int i = 0; i < 5; i++) {
			if(billCount[i] == 0)
				continue;
			System.out.println(bills[i] + " FCFA: " + billCount[i]);
		}
		for ( int i = 0; i < 3; i++) {
			if(coinCount[i] == 0)
				continue;
			System.out.println(coins[i] + " FCFA: " + coinCount[i]);
		}
		
				
	}
	public static void main(String[] ars) {
		changeCalculator();
		
	}
}
