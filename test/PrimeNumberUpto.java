package test;

import java.util.Scanner;

public class PrimeNumberUpto {

	public static void main(String[] args) {
		
		System.out.println("Enter the number upto which you want prime number");
		Scanner sc = new Scanner (System.in);
		int count=0;
		
		int number=sc.nextInt();
		for(int i=2;i<=number;i++) {
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			
			if(count==2) {
				System.out.print(i+" ");
			}
			count=0;
		}
		

	}

}
