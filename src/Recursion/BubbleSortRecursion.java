package Recursion;

public class BubbleSortRecursion {

	public static void BubbleSort(int array[],int n)
	{
		
		if(n==1)
			return;
		
		for(int j=0;j<=(n-2);j++)
		{
			if(array[j]>array[j+1])
			{
			int temp=array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
			}
		}
		
		BubbleSort(array, n-1);
		
	}
	
	public static void main(String[] args) {

		int a[]= {6,8,2,1,7,25,72,13,64,35};
		BubbleSort(a,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
