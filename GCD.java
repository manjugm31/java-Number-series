package com.kn.gcd;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the 2 number");
		int num1=Scan.nextInt();
		int num2=Scan.nextInt();
		int gcd=1;
		for(int i=1;i<num1 && i<num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;}}
				System.out.println(gcd);
				
			
		
		
		

	}

}
