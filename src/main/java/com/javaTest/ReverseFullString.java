package com.javaTest;

import java.util.ArrayList;
import java.util.List;

public class ReverseFullString {
	
	public static void testReversrFullString() {
	String str="Rahul Test Kapse";
	ArrayList<Character>arr1=new ArrayList<Character>();
	ArrayList<String>arr2=new ArrayList<String>();
	//char ch = 0; 
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		arr1.add(ch);
		arr2.add(String.valueOf(ch));
	}
	System.out.print(arr2.toString());
	System.out.println();
	System.out.println();
	
	String[] arr3=str.split(" ");
	System.out.println(arr3[0].toString());
	System.out.println(arr3[1].toString());
	System.out.println(arr3[2].toString());
	
	for(int i=arr3[0].length()-1;i>=0;i--) {
		char ch1=str.charAt(i);
		arr1.add(ch1);
		arr2.add(String.valueOf(ch1));
	}
	System.out.print(arr2.toString());
	
	
	
	
	System.out.println();
	String[] words = str.split(" ");
    
    List<String> reversedWords = new ArrayList<>();

    for (String word : words) {
        StringBuilder sb = new StringBuilder(word);
        reversedWords.add(sb.reverse().toString());
    }

    System.out.println("Original: " + str);
    System.out.println("Reversed Words: " + String.join(" ", reversedWords));
}

	public static void main(String[] args) {
		testReversrFullString();
	}
}
