import java.util.*;
class Table
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number that table you want: ");
        int n=sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}