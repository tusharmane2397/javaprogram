package test;

import java.util.Scanner;

public class ExtraSpaceRemove {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();
	        String newStr = "";
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) != ' ') {
	                newStr = newStr+str.charAt(i);
	            }
	        }
	        System.out.println("String with spaces removed: " + newStr);
	    }

	}


