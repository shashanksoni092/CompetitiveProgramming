package Recursion;

public class BubbleSortRecursion2 {

	public static void BubbleSort(int array[],int j,int n)
	{
		if(n==1)
			return;
		
		if(j==n-1)
			BubbleSort(array, 0, n-1);
		
		if(array[j]>array[j+1])
		{
			int temp=array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
		}
		BubbleSort(array, j+1, n);
	}
	
	public static void main(String[] args) {

		int a[]= {6,8,2,1,7,25,72,13,64,35};
		BubbleSort(a,0,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
