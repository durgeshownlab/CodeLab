import java.util.*;
public class Array_1 
{
	public static void main(String[] args)
	{
	    int arr[]=new int[5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0; i<arr.length; i++)
	    {
	        System.out.print("Enter value : ");
	        arr[i]=sc.nextInt();   
	    }
	    
        // traversing and printing the array
        for(int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j]+" ");   
        }
	    
	}
}
