package Recursion;

public class BinarySearch {

	public static void BinarySearch(int start,int end,int key,int array[])
	{
		int mid=(start+end)/2;
		
		if(array[mid]==key)
		{
			System.out.println("Found at "+mid+" position");
			return;
		}

		if(start==end)
		{
			System.out.println("not found");
			return;
		}
			
			
		if(array[mid]<key)
			BinarySearch(mid+1, end, key, array);
		
		else
			BinarySearch(start, mid-1, key, array);
			
	}
	
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,9};
		BinarySearch(0, 7, 15, a);
	}

}
