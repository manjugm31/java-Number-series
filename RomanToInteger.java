package com.kn.romantointeger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Roman numeral:"); // Prompt the user to enter a Roman numeral
        String s = scan.nextLine(); // Read the Roman numeral from the console

        // Create a map to store the integer values corresponding to Roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1)); // Initialize result with the value of the last Roman numeral character

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 2; i >= 0; i--) {
            // Compare the integer values of the current character and the next character
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                // If current value is less than next value, subtract current value from result
                result = result - map.get(s.charAt(i));
            } else {
                // If current value is greater than or equal to next value, add current value to result
                result = result + map.get(s.charAt(i));
            }
        }

        System.out.println("Integer value of the Roman numeral is: " + result); // Print the integer value of the Roman numeral
        scan.close(); // Close the scanner
    }
}
