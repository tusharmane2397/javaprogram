package test;

public class Anagram {

	public static void main(String[] args) {
		
		String first="brag";
		String second="Grab";
		
		char[] str=first.toLowerCase().toCharArray();
		char[] str1=second.toLowerCase().toCharArray();
		
		char[] check= new char[str.length];
		
		int count=0;
		
		for(int i=0;i<str.length;i++) {
			
			for(int j=0;j<str.length;j++) {
				
				if(str[i]==str1[j]) {
					
					check[count++]=str[i];
					
				}
			}
		}
		
		
		String test=String.valueOf(check);
		
		int check2=test.compareToIgnoreCase(first);
		
		if(check2==0&&first.length()==second.length()) {
			System.out.println("Given String is an anagram");
		}
		
		else {
			System.out.println("Given String is not an anagram");
		}

	}

}
