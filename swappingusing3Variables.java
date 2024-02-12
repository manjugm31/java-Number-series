package com.kn.swapusing3variables;

public class swappingusing3Variables {

    public static void main(String[] args) {
        // Initialize variables a and b with values 5 and 9, respectively
        int a = 5;
        int b = 9;

        // Print the initial values of a and b
        System.out.println("Before swapping, a is " + a);
        System.out.println("Before swapping, b is " + b);

        // Swap the values of a and b using a third variable (temp)
        int temp = a;
        a = b;
        b = temp;

        // Print the values of a and b after swapping
        System.out.println("After swapping, a is " + a);
        System.out.println("After swapping, b is " + b);
    }
}
