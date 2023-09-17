package test;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSortExecute(int []arr) {
		int i,j,temp=0;
		
		for(i=0;i<arr.length-1;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
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
		selectionSortExecute(arr);
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
