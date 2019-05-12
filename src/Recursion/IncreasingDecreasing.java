package Recursion;

public class IncreasingDecreasing {

	
	public static void inc(int n)
	{
		if(n==0)
			return;
		inc(n-1);
		System.out.print(n+" ");
	}
	public static void dec(int n)
	{
		if(n==0)
			return;
		
		System.out.print(n+" ");
		dec(n-1);
	}
	
	public static void main(String[] args) {
		
		inc(500);
		System.out.println();
		dec(500);
		
	}

}
