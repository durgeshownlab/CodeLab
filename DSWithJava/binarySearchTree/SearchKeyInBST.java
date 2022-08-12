public class SearchKeyInBST
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

    public void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+"\t");
            inOrder(root.right);
        }
    }

    public Node searchKey(Node root, int key)
    {
        if(root==null)
        {
            return root;
        }
        if(root.data==key)
        {
            return root;
        }
        else if(key<root.data)
        {
            return searchKey(root.left, key);
        }
        else 
        {
            return searchKey(root.right, key);
        }
    }

    public static void main(String args[])
    {
        SearchKeyInBST obj=new SearchKeyInBST();
        Node root=obj.createNode(50);
        Node p1=obj.createNode(40);
        Node p2=obj.createNode(60);
        Node p3=obj.createNode(20);
        Node p4=obj.createNode(45);
        Node p5=obj.createNode(55);
        Node p6=obj.createNode(70);

        root.left=p1;
        root.right=p2;

        p1.left=p3;
        p1.right=p4;

        p2.left=p5;
        p2.right=p6;

        // obj.inOrder(root);

        System.out.println();

        Node n=obj.searchKey(root, 60);
        if(n!=null)
        {
            System.out.println("Key found : "+n.data);
        }
        else
        {
            System.out.println("Key Not Found!");
        }
    }
}