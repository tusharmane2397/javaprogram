package test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int check=number;
		int palindrome=0;
		while(number!=0) {
			
			int newNumber=number%10;
			number=number/10;
			palindrome=(palindrome*10)+newNumber;
		}
		
		if(palindrome==check) {
			System.out.println("The number "+check+" is Palindrome Number");
		}
		
		else {
			System.out.println("The number "+check+" is not Palindrome Number");
		}

	}

}
