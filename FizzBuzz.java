package com.kn.Fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("entr the number");
		int number=scan.nextInt();
		 if(number %3==0 && number%5==0) {
				System.out.println("Fizz-Buzz");
			}
		 else if(number %5==0) {
			System.out.println("Buzz");
		}
		 else if(number %3==0 ) {
			System.out.println("Fizz");
		}
		 else {
			 System.out.println("number is not divisible by 3 or 5");
		 }
		

	}

}
