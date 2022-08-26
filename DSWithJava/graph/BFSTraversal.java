import java.util.*;

public class BFSTraversal
{
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<Integer>();
        
        int node;
        int i=0; //starting node
        int[] visited={0,0,0,0,0,0,0};

        int[][] a={
            {0,1,1,1,0,0,0},
            {1,0,1,0,0,0,0},
            {1,1,0,1,1,0,0},
            {1,0,1,0,1,0,0},
            {0,0,1,1,0,1,1},
            {0,0,0,0,1,0,0},
            {0,0,0,0,1,0,0}
        };

        System.out.print(i+" ");
        visited[i]=1;
        q.add(i);

        while(!q.isEmpty())
        {
            node=q.poll();
            for (int j=0; j<7; j++)
            {
                if(a[node][j]==1 && visited[j]==0)
                {
                    System.out.print(j+" ");
                    visited[j]=1;
                    q.add(j);
                }
            }
        }
    }
}