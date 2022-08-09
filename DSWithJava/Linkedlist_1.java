public class Linkedlist_1 {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node h = head;
		while (h != null) {
			System.out.print(h.data + "\t");
			h = h.next;
		}
		System.out.println();
	}

	// code for insertAtFirst

	public void insertAtFirst(int d) {
		Node h = head;
		Node ptr = new Node(d);
		ptr.next = head;
		head = ptr;
	}

	//code for insertAtIndex

	public void insertAtIndex(int d, int index) {
		Node h = head;
		Node ptr = new Node(d);
		int i = 0;
		while (i != index - 1) {
			h = h.next;
			i++;
		}
		ptr.next = h.next;
		h.next = ptr;
	}

	// code for insertAtEnd

	public void insertAtEnd(int d) {
		Node h = head;
		Node ptr = new Node(d);

		while (h.next != null) {
			h = h.next;
		}
		h.next = ptr;
	}

	// code for insertAfterNode

	public void insertAfterNode(Node prev, int d) {
		Node ptr = new Node(d);

		ptr.next = prev.next;
		prev.next = ptr;
	}

//deletion code from here
	//code for deleteFirstNode
	public void deleteFirstNode()
	{
		Node h=head;
		head=head.next;
		h=null;
		System.gc();
	}
	
	//code for deleteFromIndex
	public void deleteFromIndex(int index)
	{
		Node h=head;
		Node ptr=h.next;
		int i=0;
		while(i!=index-1)
		{
			h=h.next;
			ptr=ptr.next;
			i++;
		}
		
		h.next=ptr.next;
		ptr=null;
		System.gc();
	}
	
	//code for deleteLastNode
	public void deleteLastNode()
	{
		Node h=head;
		Node ptr=h.next;
		while(ptr.next!=null)
		{
			h=h.next;
			ptr=ptr.next;
		}
		h.next=ptr.next;
		ptr=null;
		System.gc();
	}
	
	//code for deleteWithValue
	public void deleteWithValue(int value)
	{
		Node h=head;
		Node ptr=head.next;
		while(ptr.data != value && ptr.next != null)
		{
			h=h.next;
			ptr=ptr.next;
		}
		if(ptr.data==value)
		{
			h.next=ptr.next;
			ptr=null;
			System.gc();
		}
	}
	// driver code from here

	public static void main(String[] args) {
		Linkedlist_1 llist = new Linkedlist_1();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

		llist.printList();
		/*
		llist.insertAtFirst(10);
		llist.printList();

		llist.insertAtIndex(20, 2);
		llist.printList();

		llist.insertAtEnd(4);
		llist.printList();

		llist.insertAtEnd(5);
		llist.printList();

		llist.insertAfterNode(third, 25);
		llist.printList();
		*/
		
		/*
		llist.deleteFirstNode();
		llist.printList();
		
		
		llist.deleteFromIndex(1);
		llist.printList();
		
		
		llist.deleteLastNode();
		llist.printList();
		
		*/
		
		llist.deleteWithValue(3);
		llist.printList();
			
	}
}