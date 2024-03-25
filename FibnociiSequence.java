package com.kn.fibonacci;

import java.util.Scanner;

public class FibnociiSequence {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int nest = 0;
		Scanner scan = new Scanner(System.in);
		System.err.println("enter the number=");

		int n = scan.nextInt();
		if (n <= 0) {
			System.out.println("no valid");

		} else if (n == 1) {
			System.out.println(first);
		} else if (n == 2) {
			System.out.print(first + " " + second);
		} else {
			for (int i = 2; i <= n+1; i++) {
				nest = first + second;
				first = second;
				second = nest;
				System.out.println(nest);
			}
		}

	}

}
