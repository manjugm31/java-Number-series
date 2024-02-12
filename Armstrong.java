package com.kn.armstrong;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        int temp = number;
        int count = 0;
        int digit = 0;
        int sum = 0;

        // Count number of digits
        while (temp != 0) {
            digit = temp % 10;
            temp = temp / 10;
            count++;
        }

        // Reset temp to the original number
        temp = number;

        // Calculate sum of digits raised to the power of count
        while (temp != 0) {
            digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scan.close();
    }
}
