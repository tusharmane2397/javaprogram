package test;

public class LargestElement {

	public static void main(String[] args) {
		
		
		 int [] arr = new int [] {6, 20, 3, 14, 5};
		 
		 int maxValue=0;
		 
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]>maxValue) {
				 
				 maxValue=arr[i];
				 
			 }
			 
		 }
		 
		 System.out.println("Maximum number is "+maxValue);

	}

}
