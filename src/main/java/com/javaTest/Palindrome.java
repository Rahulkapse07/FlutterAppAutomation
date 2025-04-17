package com.javaTest;

import java.util.ArrayList;

public class Palindrome {


		
		public static boolean tets() {
		String str="1214";
		ArrayList<String>arr1=new ArrayList<String>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String t=String.valueOf(ch);
			if(arr1.contains(t)) {
				System.out.println("having duplaicate numbeer"+ch);
			}
			arr1.add(String.valueOf(ch));
			//arr1.add(ch);
		}
		System.out.println(arr1.toString());
		
ArrayList<String>arr2=new ArrayList<String>();
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch1=str.charAt(i);
			//str.valueOf(i);
			arr2.add(String.valueOf(ch1));
			
		}
		System.out.println(arr2.toString());
		if(arr1.equals(arr2)) {
			return true;}
			else {
				return false;
			}
		}
		
		public static void main(String[] args) {
			boolean bb=tets();
			System.out.println(bb);
		}
	}
	
	
