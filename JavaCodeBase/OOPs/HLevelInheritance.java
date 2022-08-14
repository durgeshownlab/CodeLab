class C1
{
    void hii()
    {
        System.out.println("hii");
    }
}

class C2 extends C1
{
    void hello()
    {
        System.out.println("hello");
    }
}

class C3 extends C1
{
    void msg()
    {
        System.out.println("hii, are you");
    }
}

public class HLevelInheritance
{
    public static void main(String[] args)
    {
        C2 c1=new C2();
        c1.hello();
        c1.hii();
        
        System.out.println();

        C3 c2=new C3();
        c2.msg();
        c2.hii();
    }
}