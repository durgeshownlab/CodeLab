public class InsertInBST
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

    public void insert(Node root, int key)
    {
        Node prev=null;

        while(root!=null)
        {
            prev=root;
            if(root.data==key)
            {
                System.out.println("Can't insert Already exist");
                return;
            }
            else if(key<root.data)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }

        Node n=createNode(key);
        if(key<prev.data)
        {
            prev.left=n;
            System.out.println("Inserted "+key);
        }
        else{
            prev.right=n;
            System.out.println("Inserted "+key);
        }
    }

    public static void main(String args[])
    {
        InsertInBST obj=new InsertInBST();
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

        obj.insert(root, 650);
        obj.inOrder(root);

        System.out.println();

        obj.insert(root, 7);
        obj.inOrder(root);

        System.out.println();
        
    }
}