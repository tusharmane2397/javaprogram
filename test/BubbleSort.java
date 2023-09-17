package test;

import java.util.Scanner;

public class BubbleSort {

	public static void BubbleSortExecute(int []arr) {
		int i,j,temp=0;
		for(i=0;i<arr.length-1;i++) {
			
			for(j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
	}

	public static void main(String [] args) {
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five integers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		BubbleSortExecute(arr);
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
