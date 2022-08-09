public class Dlist
{
	static class Node
	{
		int data;
		Node prev;
		Node next;
	}
	
	// code for traverse in dobule linked list
	static void forwardPrint(Node head)
	{
		Node h=head;
		while(h!=null)
		{
			System.out.print(h.data+"\t");
			h=h.next;
		}
	}
	
	// code for reverse print in double linked list
	static void reversePrint(Node head)
	{
		Node h=head;
		while(h.next!=null)
		{
			h=h.next;
		}
		
		while(h!=null)
		{
			System.out.print(h.data+"\t");
			h=h.prev;
		}
				
	}
	
	// code for main driver code
	public static void main(String[] args)
	{
		// creating the node
		Node head=new Node();
		head.data=10;
		
		Node second=new Node();
		second.data=20;
		
		Node third=new Node();
		third.data=30;
		
		Node forth=new Node();
		forth.data=40;
		// code for linking the node
		
		head.prev=null;
		head.next=second;
		
		second.prev=head;
		second.next=third;
		
		third.prev=second;
		third.next=forth;
		
		forth.prev=third;
		forth.next=null;
		
		forwardPrint(head);
		System.out.print("\nbackward traverse \n");
		reversePrint(head);
	}
}