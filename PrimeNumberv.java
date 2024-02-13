package com.kn.primenumber;

import java.util.Scanner;

public class PrimeNumberv {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter the number:");
        
        // Read the number entered by the user
        int number = scan.nextInt();
        
        // Initialize a variable to count the number of factors of the given number
        int count = 1; // Start from 1 since every number is divisible by 1
        
        // Loop through numbers from 1 to (number - 1) to check for factors
        for (int i = 1; i < number; i++) {
            // If the current number is a factor of the given number, increment the count
            if (number % i == 0) {
                count++;
            }
        }
        
        // If the count is 2, then the number is prime (it has only 2 factors: 1 and itself)
        if (count == 2) {
            System.out.println("It is a prime number");
            
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
