package com.javaTest;

public class StringPractice {
	
	public static void main(String[] args) {
		String str="Rahul kapse";
		
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			sb.append(ch);
			
		}
		System.out.println("Original String is :- "+str+ "And new String is:-"+sb);
		
		System.out.println("Now we will reverse the String :-");
		
		for (int i = str.length()-1; i >=0; i--) {
			char ch1=str.charAt(i);
			sb1.append(ch1);		
		}
		System.out.println("Reverse String is :-"+sb1);
		
		System.out.println("Now we are try to reverse only word with his same place");
		
		String arr[]=str.split(" ");
		System.out.println(arr[0].toString());
		System.err.println(arr[1].toString());
		
		for (String string : arr) {
			for (int i = string.length()-1;i>=0; i--) {
				char ch=string.charAt(i);
				if(sb2.equals(ch)) {
					System.out.println("this char already available in word :="+ch);
				}
				sb2.append(ch);
			}
			sb2.append(" ");
			
		}
		System.out.println("just check value in array using for each:-"+sb2);
	}

}
