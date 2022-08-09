import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int n=10;
		int x=50;
		int pos=5;
		System.out.println("The original Array is : \n"+Arrays.toString(arr));
		
		// insert the value into array
		
		arr=insertX(arr, n, pos, x);
		n++;
		System.out.println("\nArray after inserting "+x+" is  : \n"+Arrays.toString(arr));
		
		// delete the value from array
		
		arr=removeTheElement(arr, 5);
		n--;
		System.out.println("\nArray after deleting "+x+" is  : \n"+Arrays.toString(arr));
		
		// insert the value into the array
		
		arr=insertX(arr, n, 2, 25);
		System.out.println("\nArray after inserting "+x+" is  : \n"+Arrays.toString(arr)); 
		
		// delete the value from array
		arr=removeTheElement(arr, 5);
		n--;
		System.out.println("\nArray after deleteing "+x+" is  : \n"+Arrays.toString(arr));
		
		// delete the value from array
		arr=removeTheElement(arr, 5);
		n--;
		System.out.println("\nArray after deleteing "+x+" is  : \n"+Arrays.toString(arr));
		
		// delete the value from array
		arr=removeTheElement(arr, 5);
		n--;
		System.out.println("\nArray after deleteing "+x+" is  : \n"+Arrays.toString(arr));
		
		// delete the value from array
		arr=removeTheElement(arr, 5);
		n--;
		System.out.println("\nArray after deleteing "+x+" is  : \n"+Arrays.toString(arr));
	}
	
	//code for insertX() function
	
	public static int[] insertX(int arr[], int n, int pos, int x)
	{
	    int i;
	    int newarr[]=new int[n+1];
	    for(i=0; i<n+1; i++)
	    {
	        if(i<pos-1)
	        {
	            newarr[i]=arr[i];
	        }
	        else if(i==pos-1)
	        {
	             newarr[i]=x;           
	        }
	        else
	        {
	            newarr[i]=arr[i-1];
	        }
	    }
	    return newarr;
	}
	
	//code for deletion in array
	
	public static int[] removeTheElement(int arr[], int index)
	{
	    if(arr==null || index<0 || index>=arr.length)
	    {
	        System.out.println("Wrong parameter !");
	        return arr;
	    }
	    
	    int newarr[]=new int[arr.length-1];
	    for(int i=0, k=0; i<arr.length; i++)
	    {
            if(index==i)
            {
                continue;
            }
            newarr[k++]=arr[i];
	    }
	    return newarr;
	}
}




