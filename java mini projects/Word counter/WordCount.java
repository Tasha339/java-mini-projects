package com.beginnerutils;
import java.util.Scanner;
public class WordCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of space separated words");
		String[] wordList = input.nextLine().split(" ");
		input.close();
		String[] uniques = new String[wordList.length];
		int[] frequencyCount = new int[wordList.length];
		int counter = 0;
		for (String word:wordList) {
			boolean found = false;
			for(int i = 0; i < counter; i++) {
				if (uniques[i].equals(word)) {
					frequencyCount[i]++;
					found = true;
					break;
				}
			}
			if(!found) {
				uniques[counter] = word;
				frequencyCount[counter] = 1;
				counter++;
			}
		}
		for(int i = 0; i < counter; i++) {
			System.out.println(uniques[i] + ": " + frequencyCount[i]);
		}
	}
}
 