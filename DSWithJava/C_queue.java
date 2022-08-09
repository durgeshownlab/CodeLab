class Queue
{
	static final int MAX=5;
	static int front;
	static int rear;
	static int a[]=new int[MAX];
	
	Queue()
	{
		front=0;
		rear=0;
	}
	
	// function isEmpty()
	static boolean isEmpty()
	{
		return (front==rear);
	}
	
	// function isFull()
	static boolean isFull()
	{
		int r=rear;
		return ((r+1)%MAX==front);
	}
	
	// function enqueue()
	static boolean enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return false;
		}
		else
		{
			rear=(rear+1)%MAX;
			a[rear]=data;
			System.out.println("\n"+data+" is enqueued into the Queue");
			return true;
		}
	}
	
	// function dequeue()
	static boolean dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			return false;
		}
		else
		{
			front=(front+1)%MAX;
			System.out.println("\n"+a[front]+" is dequeued from queue");
			return true;
		}
	}
	
	//function printQueue()
	static void printQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
		}
		else
		{
			int f=front;
			while(f!=rear)
			{
				System.out.print(a[(f+1)%MAX]+"\t");
				f=(f+1)%MAX;
			}
		}
	}
}


public class C_queue
{
	public static void main(String[] args)
	{
		Queue q=new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.printQueue();
		
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
		
		q.enqueue(8);
		q.printQueue();
	}
}