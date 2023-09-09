package test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int check=number;
		int sum=0;
		while(number!=0) {
			
			int newNumber=number%10;
			number=number/10;
			int cube=newNumber*newNumber*newNumber;
			sum=sum+cube;
		}
		if(sum==check) {
			System.out.print("The number "+check+" is Armstrong Number");
		}
		else {
			System.out.print("The number "+check+" is not Armstrong Number");
		}

	}

}
