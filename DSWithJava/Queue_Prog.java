class Queue
{
	static final int MAX=100;
	static int front;
	static int rear;
	static int a[]=new int[MAX];
	
	Queue()
	{
		front=-1;
		rear=-1;
	}
	
	// code for isEmpty()
	static boolean isEmpty()
	{
		return (front == rear);
	}
	
	// code for isFull()
	static boolean isFull()
	{
		return (rear>=MAX-1);
	}
	
	// code for enqueue()
	static boolean enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full...");
			return false;
		}
		else
		{
			a[++rear]=data;
			System.out.println("\n"+a[rear]+" is enqueued in the Queue..");
			return true;
		}
	}
	
	//code for dequeue()
	static boolean dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty...");
			return false;
		}
		else
		{
			front++;
			System.out.println("\n"+a[front]+" is dequeueing from queue");
			return true;
		}
	}
	
	//code for printQueue()
	static void printQueue()
	{
		int f=front;
		if(isEmpty())
		{
			System.out.println("Queue is Empty..");
		}
		else
		{
			while(f!=rear)
			{
				System.out.print(a[f+1]+"\t");
				f++;
			}
		}
	}
	
	//code for peek()
	static void peek(int index)
	{
		if(index>rear || index<0)
		{
			System.out.println("\nSorry, Invalid index...");
		}
		else
		{
			System.out.println("\npeeked value is "+a[index]);
		}
	}
	
}


public class Queue_Prog
{
	public static void main(String[] args)
	{
		Queue q=new Queue();
		
		q.printQueue();
		q.dequeue();
		q.enqueue(1);
		q.printQueue();
		q.enqueue(2);
		q.printQueue();
		q.enqueue(3);
		q.printQueue();
		q.enqueue(4);
		q.printQueue();
		q.enqueue(5);
		q.printQueue();
		q.enqueue(6);
		q.printQueue();
		
		q.peek(4);
		q.peek(-3);
		q.peek(6);
		
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
	}
}