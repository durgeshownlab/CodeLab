public class Insertion
{
	
	//function of printArray
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//code for insertionSort
	static int[] insertionSort(int arr[])
	{
		int key, j;
		for(int i=1; i<=arr.length-1; i++)
		{
			key=arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
		}
		
		return arr;
	}
	
	//code for main method
	public static void main(String[] args)
	{
		int arr[]={2,8,3,5,9};
		printArray(arr);
		printArray(insertionSort(arr));
	}
}