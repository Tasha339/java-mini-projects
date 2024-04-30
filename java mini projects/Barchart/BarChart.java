package com.beginnerutils;

public class BarChart {
	public static void main(String[] args) {
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		// copy and paste text from a document in the document variable 
		String document = "";
		StringBuilder[] frequencies = new StringBuilder[26];
		for (int i = 0; i < 26; i++)
			frequencies[i] = new StringBuilder(); 
		for (int i = 0; i < document.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(document.charAt(i) == alphabet[j]) 
					frequencies[j].append('=');
			}
		}
		System.out.println("*****************************************************************\n"
				+ "BAR-CHART SHOWING OCCURENCE FREQUENCIES OF THE\n "
				+ "      ALPHABETIC CHARACTERS IN A STRING\n"
				+ "*****************************************************************");
		for (int i = 0; i < 26; i++) {
			if (frequencies[i].length() == 0)
				continue;
			System.out.println(alphabet[i] + ": " + frequencies[i].toString());
		}
	}
}
