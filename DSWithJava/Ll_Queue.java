class Ll
{
	static Node front=null;
	static Node rear=null;
	static class Node
	{
		int data;
		Node next;
	}
	
	// function fir isEmpty()
	static boolean isEmpty()
	{
		return front==null;
	}
	
	// function for isFull()
	static boolean isFull()
	{
		Node p=new Node();
		return p==null;
	}
	
	// function for enqueue()
	static boolean enqueue(int data)
	{
		Node ptr=new Node();
		if(isFull())
		{
			System.out.println("Queue is Full");
			return false;
		}
		else
		{
			ptr.data=data;
			ptr.next=null;
			
			if(front==null)
			{
				front=rear=ptr;
				System.out.println("\n"+rear.data+" is enqueued into the queue");
				return true;
			}
			else
			{
				rear.next=ptr;
				rear=ptr;
				System.out.println("\n"+rear.data+" is enqueued into the queue");
				return true;
			}
		}
	}
	
	
	//function for dequeue
	static boolean dequeue()
	{
		Node ptr=new Node();
		ptr=front;
		
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return false;
		}
		else
		{
			front=front.next;
			int val=ptr.data;
			System.out.println("\n"+val+" is dequeued from Queue");
			ptr=null;
			System.gc();
			return true;
		}
	}
	
	//function for printList()
	static void printList()
	{
		Node f=new Node();
		f=front;
		if(f==null)
		{
			System.out.println("Queue is empty ");
		}
		else
		{
			while(f!=null)
			{
				System.out.print(f.data+"\t");
				f=f.next;
			}
		}
	}
	
}

public class Ll_Queue
{
	public static void main(String[] args)
	{
		Ll q=new Ll();
		
		q.enqueue(3);
		q.enqueue(4);
		
		q.printList();
		q.dequeue();
		q.printList();
		q.dequeue();
		q.printList();	
	}
}