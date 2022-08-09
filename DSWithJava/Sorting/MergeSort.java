public class MergeSort
{
	static void merge(int A[], int mid, int low, int high)
	{
		int i, j, k;
		int B[]=new int[100];
		i=low;
		j=mid+1;
		k=low;
		
		while(i<=mid && j<=high)
		{
			if(A[i]<A[i])
			{
				B[k]=A[i];
				i++;
				k++;
			}
			else
			{
				B[k]=A[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid)
		{
			B[k]=A[i];
			i++;
			k++;
		}
		
		while(j<=mid)
		{
			B[k]=A[j];
			j++;
			k++;
		}
		
		for(int l=0; l<=high; l++)
		{
			A[l]=B[l-i];
		}
	}
	
	static void ms(int A[], int low, int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			ms(A, low, mid);
			ms(A, mid+1, high);
			merge(A, mid, low, high);
		}
	}
	
	static void printArray(int A[])
	{
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int A[]={5,6,7,2,3,4};
		printArray(A);
		ms(A, 0, 6);		
	}
}