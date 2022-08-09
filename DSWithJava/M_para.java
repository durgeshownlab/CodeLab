import java.util.*;

class Stack
{
	static final int MAX=100;
	static int top;
	static char a[]=new char[MAX];
	
	//constructer
	Stack()
	{
		top=-1;
	}
	
	//code for isFull
	static boolean isFull()
	{
		return (top>MAX);
	}
	
	//code for isEmpty
	static boolean isEmpty()
	{
		return (top<0);
	}
	
	//code for push
	
	static boolean push(char data)
	{
		if(top>MAX)
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			a[++top]=data;
			return true;
		}
	}
	
	// code for pop
	static char pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return '0';
		}
		else
		{
			char x=a[top--];
			return x;
		}
	}
	
	// code for match
	static boolean match(char a, char b)
	{
		if(a=='{' && b=='}')
		{
			return true;
		}
		else if(a=='[' && b==']')
		{
			return true;
		}
		else if(a=='(' && b==')')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// code for paraMatch
	
	static boolean paraMatch(String exp)
	{
		char[] exp1=exp.toCharArray();
		
		for(int i=0; i<exp1.length; i++)
		{
			if(exp1[i]=='{' || exp1[i]=='[' || exp1[i]=='(')
			{
				push(exp1[i]);
			}
			else if(exp1[i]=='}' || exp1[i]==']' || exp1[i]==')')
			{
				if(isEmpty())
				{
					return false;
				}
				else
				{
					char pchar=pop();
					if(!match(pchar, exp1[i]))
					{
						return false;
					}
				}
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


public class M_para
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		
		String e;
		System.out.print("Enter an expression : ");
		e=sc.nextLine();
		if(s.paraMatch(e))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
	}
}