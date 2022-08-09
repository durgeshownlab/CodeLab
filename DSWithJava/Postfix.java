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
	
	//function for stackTop
	static char stackTop()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return a[top];
		}
	}
	
	
	//function for isfull
	static boolean isFull()
	{
		return (top>MAX);
	}
	
	//function for isEmpty
	static boolean isEmpty()
	{
		return (top<0);
	}
	
	//function for push
	static boolean push(char data)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow ");
			return false;
		}
		else
		{
			a[++top]=data;
			return true;
		}	
	}
	
	//function for pop
	static char pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			char x=a[top--];
			return x;
		}
	}
	
	//function for isOperator
	static boolean isOperator(char op)
	{
		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// function for precedence
	static int precedence(char op)
	{
		if(op=='*' || op=='/')
		{
			return 3;
		}
		else if(op=='+' || op=='-')
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	
	// function for postfix
	static String postfix(String infix)
	{
		char[] in=infix.toCharArray();
		char postfix[]=new char[in.length];
		
		int i=0;
		int j=0;
		while(i<in.length)
		{
			if(isOperator(in[i]))
			{
				if(precedence(in[i])>precedence(stackTop()))
				{
					push(in[i]);
					i++;
				}
				else
				{
					postfix[j]=pop();
					j++;
				}
			}
			else
			{
				postfix[j]=in[i];
				j++;
				i++;
			}
		}
		
		while(!isEmpty())
		{
			postfix[j]=pop();
			j++;
		}
		
		String fPostfix=Arrays.toString(postfix);
		
		return fPostfix;
	}
}


public class Postfix
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your infix Expression : ");
		String infix=sc.nextLine();
		Stack s=new Stack();
		
		System.out.println("\nPostfix is : "+s.postfix(infix));
	}
}