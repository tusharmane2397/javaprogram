package singlyLinkedList;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		SinglyLinkedList sl=new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
            System.out.println("\nLinked List Operations Menu:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Show Data");
            System.out.println("8. Show Count of Nodes");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            
            
            switch(choice) {
            
            case 1:
            System.out.println("Enter the data");
            int dataAtStart=sc.nextInt();
            sl.addAtFirst(dataAtStart);
            break;
            
            case 2:
            System.out.println("Enter the data");
            int dataAtEnd=sc.nextInt();
            sl.addAtEnd(dataAtEnd);
            break;
            
            case 3:
            System.out.println("Enter the Position at which you want to add data");
            
            int position=sc.nextInt();
            
            System.out.println("Enter the data");
            
            int dataAtPosition=sc.nextInt();
            
            sl.addAtPosition(position, dataAtPosition);
            
            break;
            
            case 4:
            sl.removeAtFirst();
            break;
            
            case 5:
            sl.removeAtEnd();
            break;
            
            case 6:
            System.out.println("Enter the position to remove the data");
            int pos=sc.nextInt();
            sl.removeAtPosition(pos);
            
            break;
            
            case 7:
            	sl.showData();
            	break;
            	
            case 8:
            	sl.displayCountNodes();
            	
            	break;
            	
            case 9:
            	
            	System.exit(0);
            	
            	
            default:
            	System.out.println("Invalid choice. Please enter a valid option.");
            	
            
            
            }
		
	}

}
}
