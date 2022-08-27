public class DFSTraversal
{
    
    public void DFS(int[][] a, int[] visited, int i)
    {
        System.out.print(i+" ");
        visited[i]=1;
        
        for(int j=0; j<7; j++)
        {
            if (a[i][j]==1 && visited[j]==0)
            {
                DFS(a, visited, j);    
            }
        }
    }

    public static void main(String[] args)
    {
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
        DFSTraversal obj=new DFSTraversal();
        obj.DFS(a, visited, 0);    
    }
}