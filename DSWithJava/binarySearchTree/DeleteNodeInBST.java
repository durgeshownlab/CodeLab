public class DeleteNodeInBST
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

    public Node inOrderPredecessor(Node root)
    {
        root=root.left;
        while(root.right!=null)
        {
            root=root.right;
        }

        return root;
    }

    public Node deleteNode(Node root, int key)
    {
        Node iPre;
        if(root==null)
        {
            return null;
        }

        if(root.left==null && root.right==null)
        {
            root=null;
            System.gc();
            return null;
        }

        if(key<root.data)
        {
            root.left=deleteNode(root.left, key);
        }
        else if(key>root.data)
        {
            root.right=deleteNode(root.right, key);
        }
        else if(key==root.data)
        {
            iPre=inOrderPredecessor(root);
            root.data=iPre.data;
            root.left=deleteNode(root.left, iPre.data);
        }

        return root;
    }

    
    public static void main(String args[])
    {
        DeleteNodeInBST obj=new DeleteNodeInBST();
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

        obj.inOrder(root);
        System.out.println();

        obj.deleteNode(root, 20);
        obj.inOrder(root);
        System.out.println();
        
        obj.deleteNode(root, 70);
        obj.inOrder(root);
        System.out.println();
    }
}