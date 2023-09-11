package test;

import java.util.Scanner;

public class SortArrayAscendingBubbleSort {

	public static void main(String[] args) {
		
	    int [] arr = new int [] {5, 2, 8, 7, 1}; 
	    int temp=0;
	    
	    
	    for(int i=0;i<arr.length-1;i++) {
	    	
	    	for(int j=0;j<arr.length-i-1;j++) {
	    		
	    		if(arr[j]>arr[j+1]) {
	    			
	    			temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    			
	    		}
	    	}
	    	
	    }
	    
	   for(int a:arr) {
		   
		   System.out.print(a);
	   }
	   System.out.println();
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter which largest number you want");
	   
	   int num=sc.nextInt()-1;
	   
	   System.out.println(arr[num]);

	}

}
