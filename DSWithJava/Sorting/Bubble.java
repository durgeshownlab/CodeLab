public class Bubble
{
	//code for normal bubbleSort algorithm
	static int[] bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}
	
	// code for adaptive bubbleSort algorithm 
	static int[] adaptiveBubbleSort(int arr[])
	{
		int n=arr.length;
		boolean isSorted=true;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSorted=false;
				}
			}
			if(isSorted)
			{
				return arr;
			}
		}
		
		return arr;	
	}		
	
	//code for printing the array
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int arr[]={1,5,6,8,3,2};
		printArray(arr);
		arr=bubbleSort(arr);
		printArray(arr);
		arr=adaptiveBubbleSort(arr);
		
		printArray(arr);	
	}
}