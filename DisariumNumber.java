package com.kn.disariumNumber;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		int temp = number;
		int digit = 0;
		int count = 0;
		int sum = 0;
		while (temp > 0) {
			digit = temp % 10;
			count++;
			temp = temp / 10;
		}
		// for (int i = count-1; i >= 0; i--) {
		temp = number;
		while (temp > 0) {
			digit = temp % 10;
			sum = (int) (sum + Math.pow(digit, count));
			temp = temp / 10;
			count--;

		}
		System.out.println(sum);

	}
}
