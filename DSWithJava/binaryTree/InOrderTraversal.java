public class InOrderTraversal
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

    void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+"\t");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        InOrderTraversal obj=new InOrderTraversal();

        Node root=obj.createNode(1);
        Node p1=obj.createNode(2);
        Node p2=obj.createNode(3);
        Node p3=obj.createNode(4);

        root.left=p1;
        root.right=p2;
        p2.right=p3;

        obj.inOrder(root);
        System.out.println();
    }

}