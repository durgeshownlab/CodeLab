public class PreOrderTraversal
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

    public void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+"\t");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args)
    {
        PreOrderTraversal obj=new PreOrderTraversal();
        
        Node root=obj.createNode(1);
        Node p2=obj.createNode(2);
        Node p3=obj.createNode(3);
        Node p4=obj.createNode(4);

        root.left=p2;
        root.right=p3;

        p2.left=p4;

        obj.preOrder(root);
        System.out.println();
        
    }
}