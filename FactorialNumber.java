package com.kn.factorialnumber;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        
        // Initialize the factorial variable to store the result
        int factorial = 1;
        
        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        
        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
