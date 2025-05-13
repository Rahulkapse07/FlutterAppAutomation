package com.javaTest;


public class WordReverse {

	public static void main(String[] args) {
		String str="Hello there";
		String[] arr=str.split(" ");
		String rev="";
		for (String string : arr) {
			for(int i =string.length()-1;i>=0;i--) {
				char ch=string.charAt(i);
				rev+=ch;
			}
			rev+=" ";
		}
		System.out.println(rev);
		System.out.println("***********************************");
		
		String str1="Hey hello again";
		String rev2="";
		for(int i=str1.length()-1;i>=0;i--) {
			char ch1=str1.charAt(i);
			rev2+=ch1;
			
		}
		rev2+=" ";
		System.out.println(rev2);
	}
	
	

}
