import java.util.*;
class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number that table you want: ");
        int n=sc.nextInt();

        int ans=1;
        for(int i=1; i<=n; i++)
        {
            ans=ans*i;
        }
        System.out.println(ans);
    }
}