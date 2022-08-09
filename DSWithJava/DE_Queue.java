class Queue
{
	static final int MAX=100;
	static int rear;
	static int front;
	static int a[]=new int[MAX];
	
	Queue()
	{
		front=-1;
		rear=-1;
	}
	
	// function for enqueue()
	static boolean enqueueF(int data)
	{
		if(front==-1)
		{
			System.out.println("\nFront Side is full, So can't Enque");
			return false;
		}
		else
		{
			a[front--]=data;
			System.out.println("\n"+data+" is enqueued into the Queue");
			return true;
		}
	}
	
	// function for enqueueR()
	static boolean enqueueR(int data)
	{
		if(rear==MAX-1)
		{
			System.out.println("\nQueue is Full");
			return false;
		}
		else
		{
			a[++rear]=data;
			System.out.println("\n"+data+" is enqueued into the Queue");
			return true;
		}
	}
	
	// function for dequeueF()
	static boolean dequeueF()
	{
		if(front==rear)
		{
			System.out.println("\nSorry, Queue is empty");
			return false;
		}
		else
		{
			int d=a[++front];
			System.out.println("\n"+d+" is dequeued from the Queue");
			return true;
		}
	}
	
	// function for dequeueR()
	static boolean dequeueR()
	{
		if(rear==front)
		{
			System.out.println("\nQueue is Empty");
			return false;
		}
		else
		{
			int d=a[rear--];
			System.out.println("\n"+d+" is dequeued from Queue");
			return true;
		}
		
	}
	
	// function for printQueue()
	static void printQueue()
	{
		int f=front;
		if(f==rear)
		{
			System.out.println("\nQueue is Empty");
		}
		else
		{
			while(f!=rear)
			{
				System.out.print(a[++f]+"\t");
			}
		}
	}	
}


public class DE_Queue
{
	public static void main(String[] args)
	{
		Queue q=new Queue();
		
		q.enqueueR(1);
		q.printQueue();
		
		q.enqueueR(2);
		q.printQueue();
		
		q.dequeueF();
		q.printQueue();

		q.enqueueF(3);
		q.printQueue();
		
		q.dequeueR();
		q.printQueue();
		
		q.dequeueR();
		q.printQueue();
	}
}