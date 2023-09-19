package singlyLinkedList;

public class SinglyLinkedList {
	
	private Node head;
	
	
	public SinglyLinkedList() {
		
		head=null;
		
	}
	
	public void addAtEnd(int data) {
		
		Node newNode = new Node();
		
		newNode.setData(data);
		newNode.setNext(null);
		
		if(head==null) {
		
			head=newNode;
			
			System.out.println("Data Added Successfully");
			
		}
		
		else {
			
			Node trav=head;
			
			while(trav.getNext()!=null) {
				
				trav=trav.getNext();
				
			}
			
			trav.setNext(newNode);
			System.out.println("Data Added Successfully");
		}
		
	}
	
	
	public void showData() {
		
		Node trav=head;
		while(trav!=null) {
			
			System.out.print(trav.getData()+" ");
			
			
			trav=trav.getNext();
			
		}
			
	}
	
	
	public void addAtFirst(int data) {
		
		Node newNode=new Node();
		
		newNode.setData(data);
		newNode.setNext(null);
		
		if(head==null) {
			
			head=newNode;
			
			System.out.println("Data Added Successfully");
			
		}
		
		
		else {
			
			newNode.setNext(head);
			head=newNode;
			
			System.out.println("Data Added Successfully");
		}
		
	}
	
	
	public int CountNodes() {
		
		Node trav=head;
		int count=0;
		
		while(trav!=null) {
		
			count++;
			trav=trav.getNext();
		}
		
		
		return count;
	}
	
	
public void displayCountNodes() {
		
		Node trav=head;
		int count=0;
		
		while(trav!=null) {
		
			count++;
			trav=trav.getNext();
		}
		
		System.out.println("The Number of nodes are "+count);
		
	}
	
	
	public void addAtPosition(int pos,int data) {
		
		int number=CountNodes();
		
		
		if(pos==1) {
			
			addAtFirst(data);
		}
		
		if(pos==number+1) {
			
			addAtEnd(data);
		}
		
		
		if(pos>1 && pos<=number) {
			
			Node newNode=new Node();
			newNode.setData(data);
			newNode.setNext(null);
			
			Node current=head;
			Node previous=null;
			for(int i=0;i<=pos-2;i++) {	
				previous=current;
				current=current.getNext();				
			}
			
			newNode.setNext(current);
			previous.setNext(newNode);
			
			System.out.println("Data Added Successfully");
			
		}
		
		
		if(pos>=CountNodes()+2 || pos<=0) {
			
			System.out.println("Position "+pos+" is beyond reach to add");
		}
		
		
			
		
	}
	
	public void removeAtFirst() {
		
		Node trav=head;
		trav=trav.getNext();
		head=trav;
		
		System.out.println("Data Removed Successfully");
		
	}
	
	public void removeAtEnd() {
		
		Node trav=head;
		for(int i=0;i<CountNodes()-2;i++) {
			
			trav=trav.getNext();
		}
		trav.setNext(null);
		
		System.out.println("Data Removed Successfully");
		
	}
	
	
	public void removeAtPosition(int pos) {
		
		
		
		if(pos==1) {
			
			removeAtFirst();
		}
		
		if(pos==CountNodes()) {
			
			removeAtEnd();
			
		}
		
		if(pos>1 && pos<CountNodes()) {
			
			Node current=head;
			Node previous=null;
			
			for(int i=0;i<=pos-2;i++) {
				
				previous=current;
				current=current.getNext();
				
			}
			
			previous.setNext(current.getNext());
			
			System.out.println("Data Removed Successfully");
			
			
		}
		
		if(pos>CountNodes() || pos<=0) {
			
			System.out.println("Position "+pos+" is beyond reach to remove");
		}
		
	}
	

}
