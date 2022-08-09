public class Binarytree
{
	static class Node
	{
		int data;
		Node left;
		Node right;
	}
	
	public Node createNode(int data)
	{
		Node n=new Node();
		n.data=data;
		n.left=null;
		n.right=null;
		
		return n;
	}
	
	
	public static void main(String[] args)
	{
		/*
		Node root=new Node();
		root.data=5;
		root.left=null;
		root.right=null;
		
		Node p2=new Node();
		p2.data=6;
		p2.left=null;
		p2.right=null;
		
		Node p3=new Node();
		p3.data=7;
		p3.left=null;
		p3.right=null;
		*/
		Binarytree obj=new Binarytree();
		
		Node root=obj.createNode(5);
		Node p2=obj.createNode(6);
		Node p3=obj.createNode(7);
		
		root.left=p2;
		root.right=p3;
		
		System.out.println(root.data);
		System.out.println(root.left.data);
		
		System.out.println(p2.data);
		System.out.println(p3.data);
	}
}