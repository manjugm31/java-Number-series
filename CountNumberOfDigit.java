package com.kn.countNumberOfDigit;

import java.util.Scanner;

public class CountNumberOfDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int count = 0;
        int digit;

        // Counting the number of digits in the input number
        while (number > 0) {
            digit = number % 10;
            count++;
            number = number / 10;
        }

        System.out.println("Number of digits: " + count);
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
