class Hii
{
    void hii()
    {
        System.out.println("hii");
    }
}

class Hello extends Hii
{
    void hello()
    {
        System.out.println("hello");
    }
}

class Msg extends Hello
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
        Msg c3=new Msg();
        c3.msg();
        c3.hello();
        c3.hii();
        
        Hello c2=new Hello();
        //c2.msg();
        c2.hello();
        c2.hii();

        Hii c1=new Hii();
        // c1.msg();
        // c1.hello();
        c1.hii();

        Hii c4=new Hello();
        // c4.msg();
        // c4.hello();
        c4.hii();

        Hii c5=new Msg();
        // c5.msg();
        // c5.hello();
        c5.hii();

        Hello c6=new Msg();
        // c6.msg();
        c6.hello();
        c6.hii();


    }
}