package com.kn.narcissistic;

import java.util.Scanner;

public class Narcissistic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        int temp = number;
        int digit;
        int count = 0;
        int sum = 0;

        // Count number of digits
        while (temp > 0) {
            digit = temp % 10;
            count++;
            temp = temp / 10;
        }

        // Reset temp to the original number
        temp = number;

        // Calculate sum of digits raised to the power of count
        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }

        // Print the sum of powers of digits
        System.out.println("Sum of powers of digits: " + sum);

        scan.close();
    }
}
