public class AVL
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        int height;
    }

    // craete node function
    public Node createNode(int data)
    {
        Node n=new Node();
        n.data=data;
        n.left=null;
        n.right=null;
        n.height=1;

        return n;
    }

    // function to get Height of a Node
    public int getHeight(Node n)
    {
        if(n==null)
        {
            return 0;
        }
        return n.height;
    }

    // function get Balance Factor
    public int getBalanceFactor(Node n)
    {
        if(n==null)
        {
            return 0;
        }
        return getHeight(n.left)-getHeight(n.right);
    }

    //max function
    public int max(int a, int b)
    {
        return (a>b)?a:b;
    }

    // leftRotate function
    public Node leftRotate(Node x)
    {
        Node y=x.right;
        Node t2=y.left;

        y.left=x;
        x.right=t2;

        x.height=max(getHeight(x.right), getHeight(x.left))+1;
        y.height=max(getHeight(y.right), getHeight(y.left))+1;

        return y;
    }

    // rightRotation function
    public Node rightRotate(Node y)
    {
        Node x=y.left;
        Node t2=x.right;

        x.right=y;
        y.left=t2;

        x.height=max(getHeight(x.right), getHeight(x.left))+1;
        y.height=max(getHeight(y.right), getHeight(y.left))+1;

        return x;
    } 

    //insert function
    public Node insert(Node node, int key)
    {
        if(node==null)
        {
            return createNode(key);
        }
        if(key<node.data)
        {
            node.left=insert(node.left, key);
        }
        else if (key>node.data)
        {
            node.right=insert(node.right, key);    
        }

        node.height=1+max(getHeight(node.left), getHeight(node.right));

        int bf=getBalanceFactor(node);

        //left left case
        if(bf>1 && key<node.left.data)
        {
            return rightRotate(node);
        }

        //right right case
        if(bf<-1 && key>node.right.data)
        {
            return leftRotate(node);
        }

        //left right case
        if(bf>1 && key>node.left.data)
        {
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }

        if(bf<-1 && key<node.right.data)
        {
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    //inOrder function
    public void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args)
    {
        AVL obj=new AVL();
        
        Node root=null;

        root=obj.insert(root, 4);
        obj.inOrder(root);
        System.out.println();

        root=obj.insert(root, 7);
        obj.inOrder(root);
        System.out.println();
        
        root=obj.insert(root, 2);
        obj.inOrder(root);
        System.out.println();

        root=obj.insert(root, 3);
        obj.inOrder(root);
        System.out.println();

        root=obj.insert(root, 1);
        obj.inOrder(root);
        System.out.println();

        // root=obj.insert(root, 5);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 6);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 8);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 9);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 90);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 45);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 29);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, 0);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, -9);
        // obj.inOrder(root);
        // System.out.println();

        // root=obj.insert(root, -5);
        // obj.inOrder(root);
        // System.out.println();
    }
}