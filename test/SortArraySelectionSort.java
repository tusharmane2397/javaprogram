package test;

public class SortArraySelectionSort {

	public static void main(String[] args) {
		
		
		  int [] arr = new int [] {5, 2, 8, 7, 1}; 
		    int temp=0;
		    
		    
		    for(int i=0;i<arr.length-1;i++) {
		    	
		    	for(int j=i+1;j<arr.length;j++) {
		    		
		    		if(arr[i]>arr[j]) {
		    			
		    			temp=arr[i];
		    			arr[i]=arr[j];
		    			arr[j]=temp;
		    			
		    		}
		    	}
		    	
		    }
		    
		    for(int a:arr) {
				   
				   System.out.print(a);
			   }


	}

}
