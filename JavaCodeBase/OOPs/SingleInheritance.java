class Sum
{
    void sum(int x, int y)
    {
        System.out.println(x+y);
    }
}

class Sub extends Sum
{
    void sub(int x, int y)
    {
        System.out.println(x-y);
    }
}

public class SingleInheritance
{
    public static void main(String args[])
    {
        Sum s1=new Sum();
        s1.sum(2, 4);
        //s1.sub(4, 3); this wrong becaue in single level inheritance bottom up approach is getting used

        Sub s2=new Sub();
        s2.sub(5, 65);
        s2.sum(8, 9);

        Sum s3=new Sub();
        s3.sum(5, 9);
        
    }
}