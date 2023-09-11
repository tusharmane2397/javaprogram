package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatedNumberArray {

	public static void main(String[] args) {
		
		/*
		 * int arr[]= {1,2,2,3,4,8,8,5}; int count=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * for(int j=0;j<arr.length;j++) {
		 * 
		 * if(arr[i]==arr[j]) {
		 * 
		 * count++; }
		 * 
		 * } System.out.println(arr[i]+" is repeated "+count+" times"); count=0;
		 * 
		 * }
		 */
		
		
		int arr[]= {1,2,2,3,4,8,8,5};
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int a:arr) {
			if(hm.containsKey(a)) {
				
				hm.put(a,hm.get(a)+1);
				
			}
			
			else {
				
				hm.put(a,1);
			}
		}
		
		
		for(Entry<Integer, Integer> i:hm.entrySet()) {
			
		System.out.println(i.getKey()+" is repeated "+i.getValue()+" times");
			
		}
	
		
	
	}

}
