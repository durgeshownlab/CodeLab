public class Selection
{
	//code for printArray
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	//code for selection sort
	static int[] selectionSort(int[] arr)
	{
		System.out.println("Selection Sort is runing.....");
		int indexOfMin, temp;
		for(int i=0; i<arr.length-1; i++)
		{
			indexOfMin=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[indexOfMin])
				{
					indexOfMin=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[indexOfMin];
			arr[indexOfMin]=temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) 
	{
		int arr[]={2,4,7,4, 1,8};
		printArray(arr);
		arr=selectionSort(arr);
		printArray(arr);
	}
}