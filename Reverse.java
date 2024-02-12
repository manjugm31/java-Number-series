package com.kn.reverse;

public class Reverse {

	public static void main(String[] args) {
		int a=12345;
	
		int count=0,n=0;
		while(a>0) {
		n=a%10;
		 count++;
		a=a/10;
		System.out.print(n);
		}
		
		System.out.println(count);
		

	}

}
