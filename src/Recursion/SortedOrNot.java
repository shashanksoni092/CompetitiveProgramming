package Recursion;

public class SortedOrNot {

	
	public static boolean CheckSorted(int start,int end,int []array)
	{
		if(start==end)
			return true;
		
		if(array[start]<array[start+1] && CheckSorted(start+1, end, array))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		
	int a[]= {1,2,13,14,15};
	//System.out.println("a");
	System.out.println(CheckSorted(0, 4, a));
	}

}
