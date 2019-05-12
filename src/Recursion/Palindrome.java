package Recursion;

public class Palindrome {

	private static boolean Palindrome(int i, int j, int[] arr) {
	
		if(i>=j)
			return true;
		
		if(arr[i]!=arr[j])
			return false;
		
		else
			return Palindrome(i+1, j-1, arr);
	}

	
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,3,5,2,1};
		boolean res=Palindrome(0,arr.length-1,arr);
		System.out.println(res);
	}


}
