public class CheckBST
{
    static class Node
    {
        int data;
        Node left;
        Node right;
    }

    public Node createNode(int data)
    {
        Node p=new Node();
        p.data=data;
        p.left=null;
        p.right=null;

        return p;
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

    static Node prev=null;

    public boolean isBST(Node root)
    {
        if(root!=null)
        {

            if(!isBST(root.left))
            {
                return false;
            }
            
            if(prev!=null && root.data<=prev.data)
            {
                return false;
            }
            
            prev=root;
            
            return isBST(root.right);
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args) 
    {
        CheckBST obj=new CheckBST();
        Node root=obj.createNode(5);
        Node p1=obj.createNode(3);        
        Node p2=obj.createNode(6);        
        Node p3=obj.createNode(1);        
        Node p4=obj.createNode(4);        

        root.left=p1;
        root.right=p2;
        p1.left=p3;
        p1.right=p4;

        obj.inOrder(root);
        System.out.println();
        System.out.println(obj.isBST(root));
    }
}