package test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter how many fibonacci number you want");
		Scanner sc = new Scanner (System.in);

		int number=sc.nextInt();
		int previous=0;
		int next=1;
		int sum;
		
		System.out.print(previous+" "+next+" ");
		
		for(int i=0;i<number-2;i++) {
			
			sum=previous+next;
			 
			System.out.print(sum+" ");
			
			previous=next;
			next=sum;
				
			
		}

	}

}
