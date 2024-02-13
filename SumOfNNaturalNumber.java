package com.kn.sumofnnanturalnumber;

import java.util.Scanner;

public class SumOfNNaturalNumber {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter the number:");
        
        // Read the number entered by the user
        int number = scan.nextInt();
        
        // Initialize variables to store the sum of digits and the current digit
        int sum = 0;
        int digit = 0;
        
        // Loop through each digit of the number until there are no more digits left
        while (number > 0) {
            // Extract the rightmost digit of the number
            digit = number % 10;
            
            // Add the current digit to the sum
            sum = sum + digit;
            
            // Remove the rightmost digit from the number
            number = number / 10;
        }
        
        // Print the sum of digits
        System.out.println("Sum of digits in the entered number: " + sum);
    }
}
