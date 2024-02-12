package com.kn.BuzzNumber;

import java.util.Scanner;

public class BuzzNumber {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        
        // Read the input number
        int number = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the input number is a Buzz Number and print the result
        if (isBuzzNumber(number)) {
            System.out.println("Buzzed");
        } else {
            System.out.println("Not Buzzed");
        }
    }

    // Method to check if a number is a Buzz Number
    private static boolean isBuzzNumber(int num) {
        // A number is a Buzz Number if it is divisible by 7 or ends with the digit 7
        return num % 7 == 0 || num % 10 == 7;
    }
}