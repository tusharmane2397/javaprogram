package test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String newString="";
		
		/*
		 * StringBuffer sb=new StringBuffer(str);
		 * 
		 * String newString=sb.reverse().toString();
		 * 
		 * if(str.equals(newString)) {
		 * System.out.println("The given String is Palindrome"); } else {
		 * 
		 * System.out.println("The given String is not Palindrome"); }
		 */
		
		
		for(int i=str.length()-1;i>=0;i--) {
//			to reverse the string
//			char newString=str.charAt(i);
//			System.out.print(newString);
			
			newString=newString+str.charAt(i);
				
			
		}
		
		if(str.equals(newString)) {
			System.out.println("The given String "+str+" is Palindrome ");
		}
		
		else {
			System.out.println("The given String "+str+" is not Palindrome ");
		}
	}

}
