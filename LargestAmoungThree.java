package com.kn.largestamoung3;

import java.util.Scanner;

public class LargestAmoungThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();
        
        System.out.println("Enter the value of c:");
        int c = scanner.nextInt();
        
        scanner.close();

        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}
