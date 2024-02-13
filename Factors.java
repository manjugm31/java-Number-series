package com.kn.factors;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number-");
		int number= scan.nextInt();
		int factor=1;
		for(int i=1;i<number;i++) {
			
			if(number%i==0) {
				System.out.println(i);
			}
		}
	
		

	}

}
