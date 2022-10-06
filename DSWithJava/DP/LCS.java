import java.util.*;
public class LCS
{
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
        System.out.println("length "+lcs.lcsRcursive(s1, s2, s1.length(), s2.length()));
    }
}