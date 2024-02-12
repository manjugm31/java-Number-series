package com.kn.leapYear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Continuous loop to prompt the user for input
        while (true) {
            System.out.println("Enter the year (enter 0 to exit):");
            int year = scan.nextInt();
            
            // Exit loop if the user enters 0
            if (year == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        scan.close();
    }
}
