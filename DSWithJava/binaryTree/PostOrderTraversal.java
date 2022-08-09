public class PostOrderTraversal
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

    void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"\t");
        }
    }

    public static void main(String[] args) {
        PostOrderTraversal obj=new PostOrderTraversal();

        Node root=obj.createNode(1);
        Node p1=obj.createNode(2);
        Node p2=obj.createNode(3);
        Node p3=obj.createNode(4);

        root.left=p1;
        root.right=p2;
        p2.right=p3;

        obj.postOrder(root);
        System.out.println();
    }

}