package com.beginnerutils;
import java.util.Random;
import java.util.Scanner;
public class BirthdayParadoxTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("How many people are you considering?");
		int n = input.nextInt();
		input.close();
		int count = 0;
		int[] months = new int[n];
		int[] days = new int[n];
		for (int i = 0; i<n; i++) {
			months[i] = random.nextInt(12) + 1;
			days[i] = random.nextInt(31) + 1;
		}
		for(int i=0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				if(days[i] == days[k] && months[i] == months[k] && i != k)
					count++;
			}
		}
		/* 
		 * include this part to be sure of the number of identical birthdays
		 * provided by the program
		 
		for (int i = 0; i < numberOfAges; i++)
			System.out.println(days[i] + "/" + months[i]);
			
		*/
		System.out.println("There are " + count + " identical birthdays");
	}  
}
