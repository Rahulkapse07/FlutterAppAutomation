package com.javaTest;

public class SwapNumber {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+"and"+b);
		
		
		int c=7;
		int d=8;
		
		int temp;
		
		temp=c;
		c=d;
		d=temp;
		
		System.out.println(c+"and"+d);

	}

}
