import java.util.*;
class Fabonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number for Fabonacci series: ");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print("0\t1\t");
        for(int i=1; i<n; i++)
        {
            int temp=first+second;
            first=second;
            second=temp;
            System.out.print(temp+"\t");
        }
    }
}