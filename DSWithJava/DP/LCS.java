import java.util.*;
public class LCS
{
    // DP solution function
    int lcsDP(String s1, String s2, int m, int n, int[][] memo)
    {
        if(memo[m][n]!=-1)
        {
            return memo[m][n];
        }
        if(m==0 || n==0)
        {
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            memo[m][n]=1+lcsDP(s1, s2, m-1, n-1, memo);
        }
        else
        {
            memo[m][n]=Math.max(lcsDP(s1, s2, m, n-1, memo), lcsDP(s1, s2, m-1, n, memo));
        }
        return memo[m][n];
    }
    // recursive function
    int lcsRcursive(String s1, String s2, int m, int n)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return 1+lcsRcursive(s1, s2, m-1, n-1);
        }
        else
        {
            return Math.max(lcsRcursive(s1, s2, m, n-1), lcsRcursive(s1, s2, m-1, n));
        }
    }
    public static void main(String[] args) 
    {
        LCS lcs=new LCS();
        String s1="ABDGH";
        String s2="AEDFHR";
        int [][] memo=new int[s1.length()+1][s2.length()+1];
        for(int i=0; i<s1.length()+1; i++)
        {
            for(int j=0; j<s2.length()+1; j++)
            {
                memo[i][j]=-1;
            }
        }

        System.out.println("length "+lcs.lcsRcursive(s1, s2, s1.length(), s2.length()));
        System.out.println("length "+lcs.lcsDP(s1, s2, s1.length(), s2.length(), memo));
    }
}