import java.util.*;
class FibDP
{
    // using memoization
    public int fibMemo(int n)
    {
        int memo[]=new int[n+1];
        Arrays.fill(memo, -1);

        if(memo[n]==-1)
        {
            int res;
            if(n==0 || n==1)
            res=n;
            else
            {
                res=fibMemo(n-1)+fibMemo(n-2);
            }
            memo[n]=res;
        }
        return memo[n];
    }

    public int fibTab(int n)
    {
        int tab[]=new int[n+1];
        tab[0]=0;
        tab[1]=1;
        for(int i=2; i<=n; i++)
        {
            tab[i]=tab[i-1]+tab[i-2];
        }

        return tab[n];
    }

    public static void main(String[] args)
    {
        FibDP obj=new FibDP();
        int n=6;
        System.out.println("Fibonacci series for "+n+" using memo is = "+obj.fibMemo(n));   
        System.out.println("Fibonacci series for "+n+" using tabulation is = "+obj.fibTab(n));   
    }
}