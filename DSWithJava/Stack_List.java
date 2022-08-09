public class Stack_List
{
	static Node top=null;
	static int length=0;
	static class Node
	{
		int data;
		Node next;
	}
	
	// code to print all the element in stack
	static void printAll()
	{
		Node t=top;
		if(t == null)
		{
			System.out.println("\nStack is Empty");
		}
		else
		{
			System.out.println("\nElement in the stack");
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
	
	// code for push function
	static void push(int element)
	{
		Node t=top;
		Node n=new Node();
		n.data=element;
		n.next=top;
		top=n;
		length++;
		System.out.println("\n"+element+" is pushed in to the stack");
	}
	
	//code for pop function
	static void pop()
	{
		if(top==null)
		{
			System.out.println("\nStack underflow ");
		}
		else
		{
			Node t=top;
			top=t.next;
			System.out.println("\n"+t.data+" is popped from stack");
			t=null;
			System.gc();
		}
	}
	
	// code for stackTop function
	static void stackTop()
	{
		if(top==null)
		{
			System.out.println("\n Stack is empty ");
		}
		else
		{
			System.out.println("\nTop most element is "+top.data);
		}
	}
	
	// code for stackBottom function
	static void stackBottom()
	{
		if(top==null)
		{
			System.out.println("\nStack is empty");
		}
		else
		{
			Node t=top;
			while(t!=null)
			{
				if(t.next==null)
				{
					System.out.println("\nBottom most element is "+t.data);
				}
				t=t.next;
			}
		}
	}
	
	//code for peek function
	static void peek(int index)
	{
		if(index>length || index<=0 || top==null)
		{
			System.out.println("\nSorry, invalid index");
		}
		else
		{
			Node t=top;
			int i=1;
			while(i<=index)
			{
				if(i==index)
				{
					System.out.println("\nElement at the index "+index+" is "+t.data);
				}
				t=t.next;
				i++;
			}
		}
	}

	
	public static void main(String[] args)
	{
			
		printAll();
		
		// calling push function and printing all the element 
		push(1);
		printAll();
		push(2);
		printAll();
		push(3);
		printAll();
		push(4);
		printAll();
		
		stackTop();
		stackBottom();
		peek(3);
		
		// calling pop function and printing all the element  
		pop();
		printAll();
		pop();
		printAll();
		pop();
		printAll();
		pop();
		printAll();
		pop();
		
	}
}