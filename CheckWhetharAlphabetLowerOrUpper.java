package com.kn.checkWhetharAlphabetLowerOrUpper;

import java.util.Scanner;

public class CheckWhetharAlphabetLowerOrUpper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		String input=scan.next();
		char character = input.charAt(0);
		if (character >= 'a' && character <= 'z') {
		    System.out.println("Character is lower case.");
		} else if (character >= 'A' && character <= 'Z') {
		    System.out.println("Character is upper case.");
		} else {
		    System.out.println("Character is not an alphabet.");
		}
//		char character = input.charAt(0);
//		if (character >= (char)97 && character <= (char)122) {
//		    System.out.println("Character is lower case.");
//		} else if (character >= (char)65 && character <= (char)90) {
//		    System.out.println("Character is upper case.");
//		} else {
//		    System.out.println("Character is not an alphabet.");
//		}

		
		

	}

}
