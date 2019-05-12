package Recursion;

public class BubbleSort {

	public static void BubbleSort(int array[])
	{
		for(int i=0;i<array.length-2;i++)
		{
			//System.out.println(array[i]);
			
			for(int j=0;j<(array.length-i-1);j++)
			{
				//System.out.print(array[j]+" ");
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
			//System.out.println();
		}
	}
	public static void main(String[] args) {

		int a[]= {6,8,2,1,7,25,72,13,64,35};
		BubbleSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
