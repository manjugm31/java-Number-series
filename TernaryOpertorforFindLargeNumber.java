package com.kn.largeamoungthreeternary;

import java.util.Scanner;

public class TernaryOpertorforFindLargeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c:");
        int c = scanner.nextInt();

        System.out.println((a > b && a > c) ? "a is greater" : "");
        System.out.println((b > c && b > a) ? "b is greater" : "");
        System.out.println((c > a && c > b) ? "c is greater" : "");

        scanner.close();
    }
}


