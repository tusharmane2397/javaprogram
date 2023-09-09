package test;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int multiply=1;
		for(int i=number;i>=1;i--) {
			
			multiply=multiply*i;
		}
		
		System.out.println("factorial of "+number+" is "+multiply);
		

	}

}
