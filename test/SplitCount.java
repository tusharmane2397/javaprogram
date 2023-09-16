package test;

public class SplitCount {
	
	public static void main(String []args) {
		
		String quote="Hi I am Tushar Rajendra Mane";
		
		String [] quoteArray=quote.split(" ");
		
		int maxCount=0;
		int minCount=0;
		String str="";
		String small=quoteArray[0];
		for(int i=0;i<quoteArray.length;i++) {
				
				int len=quoteArray[i].length();
				if(str.length()<=len) {
					
					str=quoteArray[i];
					maxCount=str.length();
				}
				if(small.length()>len) {
					small=quoteArray[i];
					minCount=small.length();
					
				}
			
		}
		
		System.out.println("Longest word in given quote is "+str+" and its length is "+maxCount);
		System.out.println("Smallest word in given quote is "+small+" and its length is "+minCount);
	}

}
