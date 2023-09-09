package test;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++) {
			
			if(number%i==0) {
				
				count++;
			}
		}
		if(count==2) {
			System.out.println("The given number "+number+" is prime Number");
		}
		else {
			System.out.println("The given number "+number+" is not prime Number");
		}
	}

}
