package com.kn.Spynumber;

public class SpyNumber {

    public static void main(String[] args) {
        int a = 1124; // The number to check if it's a spy number
        int digit = 0; // Variable to store the current digit being processed
        int sum = 0; // Variable to store the sum of the digits
        int product = 1; // Variable to store the product of the digits

        // Loop through each digit of the number
        while (a != 0) {
            digit = a % 10; // Extract the last digit
            sum = sum + digit; // Add the digit to the sum
            product = product * digit; // Multiply the digit to the product
            a = a / 10; // Remove the last digit from the number
        }

        // Check if the sum of the digits is equal to the product of the digits
        if (sum == product) {
            System.out.println("YES, it's a SPY number"); // If equal, it's a SPY number
        } else {
            System.out.println("No, it's not a SPY number"); // If not equal, it's not a SPY number
        }
    }
}
