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

class C3 extends C2
{
    void msg()
    {
        System.out.println("hii, how are you");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        C3 c3=new C3();
        c3.msg();
        c3.hello();
        c3.hii();
        
        C2 c2=new C2();
        //c2.msg();
        c2.hello();
        c2.hii();

        C1 c1=new C1();
        // c1.msg();
        // c1.hello();
        c1.hii();

        C1 c4=new C2();
        // c4.msg();
        // c4.hello();
        c4.hii();

        C1 c5=new C3();
        // c5.msg();
        // c5.hello();
        c5.hii();

        C2 c6=new C3();
        // c6.msg();
        c6.hello();
        c6.hii();


    }
}