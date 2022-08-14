class Call
{
    public void msg()
    {
        System.out.println("hello");
    }
}

public class ObjCreation
{
    public static void main(String args[])
    {
        //using forName
        /*try
        {
            Class obj=Class.forName("Call");
            Call c=(Call)obj.newInstance();

            c.msg();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }*/

        // using the clone 
        /*Call c1=new Call();

        Call c2=(Call)c1.clone();*/

        
    }
}