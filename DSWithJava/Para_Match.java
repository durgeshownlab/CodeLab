import java.util.*;

class Stack
{
	static final int MAX=100;
	static int top;
	static char a[]=new char[MAX];
	Stack()
	{
		top=-1;
	}
	
	//code for isFull()
	static boolean isFull()
	{
		return (top>=MAX);
	}
	
	//code for isEmpty()
	static boolean isEmpty()
	{
		return (top<0);
	}
	
	// code for push()
	static boolean push(char data)
	{
		if(isFull())
		{
			System.out.println("Stack overflow ");
			return false;
		}
		else
		{
			a[++top]=data;
			return true;
		}
	}
	
	// code for pop function
	static boolean pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return false;
		}
		else
		{
			int x=a[top--];
			return true;
		}	
	}
	
	//code for paranthases checking
	static boolean parenthesisMatch(String exp)
	{
		char[] exp1= exp.toCharArray();
		
		for(int i=0; i<exp1.length; i++)
		{
			if(exp1[i]=='(')
			{
				push(exp1[i]);
			}
			else if(exp1[i]==')')
			{
				if(isEmpty())
				{
					return false;
				}
				pop();
			}
		}
		
		if(isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

//code for main function
public class Para_Match 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Expresion : ");
		Scanner sc=new Scanner(System.in);
		String e=sc.nextLine();
		
		Stack s=new Stack();
		if(s.parenthesisMatch(e))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not matched");
		}
	}
}