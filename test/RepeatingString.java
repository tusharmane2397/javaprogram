package test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class RepeatingString {

	public static void main(String[] args) {
		

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		char [] ch=str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(char a:ch) {
			if(hm.containsKey(a)) {
				
				hm.put(a,hm.get(a)+1);
				
			}
			
			else {
				
				hm.put(a,1);
			}
		}
		
		
		for(Entry<Character, Integer> i:hm.entrySet()) {
			
		System.out.println(i.getKey()+" is repeated "+i.getValue()+" times");
			
		}
	
		
	
	}

	}


