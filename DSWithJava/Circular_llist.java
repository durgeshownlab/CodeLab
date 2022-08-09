public class Circular_llist
{
	static int length=0;
	static class Node
	{
		int data;
		Node next;
	}
	//code for addToEmpty function
	static Node addToEmpty(Node last, int data) 
	{
		if(last!=null)
		{
			 return last;	
		}
		Node temp=new Node();
		temp.data=data;
		last=temp;
		
		last.next=last;
		
		return last;				
	}
	
	// code for addEnd()
	
	static Node addEnd(Node last, int data)
	{
		if(last==null)
		{
			return addToEmpty(last, data);
		}
		Node temp=new Node();
		temp.data=data;
		
		temp.next=last.next;
		last.next=temp;
		
		last=temp;
		
		return last;
	}
	
	//code for addBegin()
	static Node addBegin(Node last, int data)
	{
		if(last==null)
		{
			return addToEmpty(last, data);
		}
		
		Node temp=new Node();
		temp.data=data;
		
		temp.next=last.next;
		last.next=temp;
		
		return last;	
	}
	
	// code for addAfter()
	static Node addAfter(Node last, int data, int item)
	{
		if(last==null)
		{
			return null;
		}
		Node temp, p;
		p=last.next;
		
		do
		{
			if(p.data==item)
			{
				temp=new Node();
				temp.data=data;
				temp.next=p.next;
				p.next=temp;
				if(p==last)
				{
					last=temp;
				}
				return last;
			}
			p=p.next;
		}while(p!=last.next);
		
		System.out.println(item+" not present in the list.");
		return last;
	}
	
	//code for deleteFirst()
	static Node deleteFirst(Node last)
	{
		if(last==null)
		{
			System.out.println("\nSorry, the list is empty");
			return last;
		}

		Node head=last.next;
		if(last==head)
		{
			last=null;
			return last;
		}
		last.next=head.next;
		head=null;
		System.gc();
		
		return last;
	}
	
	// code for deleteLast()
	static Node deleteLast(Node last)
	{
		if(last==null)
		{
			return last;
		}
				
		Node temp=last;
		Node p=temp.next;
		if(last==p)
		{
			last=null;
			return last;
		}
		
		while(p.next!=temp)
		{
			p=p.next;
		}
		p.next=temp.next;
		last=p;
		temp=null;
		System.gc();
		return last;
	}
	
	// code for deletGivenIndex()
	static Node deleteGivenIndex(Node last, int index)
	{
		Node p=last.next;
		Node q=p.next;
		int i=0;
		if(last==null)
		{
			return last;
		}
		if(length==1 && index<length)
		{
			last=null;
			return last;
		}
		
		if(index>=length)
		{
			int count=length-1;
			System.out.println("Wrong! index, index should be less than or equal to "+count);
		    return last;
		}
		if(index==0)
		{
			last=deleteFirst(last);
			return last;
		}
		while(i<index-1)
		{
			p=p.next;
			q=q.next;
			i++;
		}
		p.next=q.next;
		q=null;
		System.gc();
		
		return last;
	}
	
	// code for traversal
	static void traverse(Node last)
	{
		length=0;
		if(last==null)
		{
			System.out.println("The list is empty\nlist size = 0");
			return;		
		}
		Node p=last.next;
		
		do
		{
			System.out.print(p.data+"\t");
			p=p.next;
			length++;
		}while(p!=last.next);
		System.out.println("\nlist length is = "+length);
	}
	
	//code for driver function 
	public static void main(String[] args)
	{
		Node last=null;
		
		traverse(last);
		
		last=deleteFirst(last);
		traverse(last);
		
		last=addToEmpty(last, 10);
		traverse(last);
		last=addEnd(last, 20);
		traverse(last);
		last=addBegin(last, 9);
		traverse(last);
		last=addAfter(last, 50, 9);
		traverse(last);
		
		last=deleteFirst(last);
		traverse(last);
		
		/*
		last=deleteFirst(last);
		traverse(last);
		
		last=deleteFirst(last);
		traverse(last);
		
		last=deleteFirst(last);
		traverse(last);
		*/
		
		last=deleteLast(last);
		traverse(last);
		
		/*
		last=deleteLast(last);
		traverse(last);
		
		last=deleteLast(last);
		traverse(last);
		
		last=deleteLast(last);
		traverse(last);
		
		last=addEnd(last, 18);
		traverse(last);
		
		last=deleteFirst(last);
		traverse(last);*/
		
		last=deleteGivenIndex(last, 1);
		traverse(last);
		/*
		last=deleteGivenIndex(last, 0);
		traverse(last);
		
		last=deleteGivenIndex(last, 0);
		traverse(last);
		
		last=deleteFirst(last);
		traverse(last);
		*/
	}	
}