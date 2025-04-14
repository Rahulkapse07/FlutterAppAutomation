package com.javaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
	
	public static void reverse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.nextLine();
		System.out.println(str);
		ArrayList<Character>arr=new ArrayList<Character>();
		char ch = ' ';
		for (int i = str.length()-1; i >=0; i--) {
			 ch=str.charAt(i);
			if(arr.contains(ch)) {
				System.out.println("found duplicate:-"+ch);
			}
			 arr.add(ch);
		}
		System.out.println(arr.toString());
		
	}
	public static void main(String[] args) {
		reverse();
	}

}
