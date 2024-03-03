package com.kn.passwordcheck;

import java.util.Scanner;

public class PasswordCheckv {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the password");
		String p = scan.nextLine();
		PasswordCheck(p);

	}

	private static void PasswordCheck(String p) {
		int c = 0;
		if (p.matches(".*[a-z].*")) {
			c++;
		}
		if (p.matches(".*[A-z].*")) {
			c++;
		}
		if ((p.matches(".*[1-9999].*"))) {
			c++;
		}
		if (p.matches(".*[@!].*")) {
			c++;
		}
		if(p.length()>=8) {
			c++;
		}
		if(c==5) {
		System.out.println("valid");}
		else {

		System.out.println("no");}

	}

}
