class Stack
{
	static final int MAX=100;
	int top;
	int a[]=new int[MAX];
	
	// constructer 
	Stack()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
	// push function
	boolean push(int x)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack is Overflow !!");
			return false;
		}
		else
		{
			a[++top]=x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
	
	//pop function
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x=a[top--];
			return x;
		}
	}
	
	//topMost function
	int topMost()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x = a[top];
			return x;
		}
	}
	
	//bottomMost function
	void bottomMost()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("Bottom Most value is "+a[0]);
		}
	}
	
	void peek(int index)
	{
		if(index>top || index<0)
		{
			System.out.println("Invalid index");
		}
		else
		{
			System.out.println("The value on index `"+index+"` is "+a[index]);
		}
	}
	
	// display function
	void display()
	{
		if(top<0)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(a[i]);	
			}
		}
	}
}


public class Main
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println();
		
		s.display();	
		System.out.println();
		
		System.out.println(s.pop()+" popped from Stack");	
		System.out.println();

		s.display();
		
		s.bottomMost();
		
		System.out.println(s.topMost());
		
		s.peek(0);
		
		/*
		System.out.println();
		
		System.out.println(s.pop()+" popped from Stack");
		
		System.out.println();
		s.display();
		System.out.println("Stack is Empty : "+s.isEmpty());
		
		System.out.println();
		System.out.println(s.pop()+" popped from Stack");
		
		System.out.println();
		s.display();
		
		System.out.println("Stack is Empty : "+s.isEmpty());
	*/
	}
}