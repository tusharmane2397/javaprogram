package test;

public class SpecificSumArrayElements {

	public static void main(String[] args) {
		
		int [] a= {1, 5, 7, -1, 5};
		
		int sum=6;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				int check=a[i]+a[j];
				if(check==sum) {
					System.out.println(a[i]+" and "+a[j]+" will give sum of "+sum);
				}
				
			}
		}

	}

}
