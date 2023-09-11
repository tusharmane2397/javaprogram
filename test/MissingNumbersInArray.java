package test;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements you want to add in array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr2[]=new int[size];
		System.out.println("Enter "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int j=0;j<arr.length;j++) {
			
			System.out.print(arr[j]+" ");
		}
		
		for(int k=0;k<arr.length;k++) {
			
			arr2[k]=k;
			
		}
		
		for(int z=0;z<arr.length;z++) {
			
			if(arr[z]!=arr2[z]) {
				
				System.out.println("The missing number is "+arr2[z]);
			}
		}
		
		
		
		

	}

}
