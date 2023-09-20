package test;

public class WithoutSortMaxArray {

	public static void main(String[] args) {
		
		int [] arr= {12,58,45,95,63,7};
		
		int max=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				
				max=arr[i];
			}
			
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Maximum element of an array is "+max);
		System.out.println("Minimum element of an array is "+min);

	}

}
