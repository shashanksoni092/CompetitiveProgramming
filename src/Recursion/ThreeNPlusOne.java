package Recursion;

public class ThreeNPlusOne {

	public static void threeNPlusOne(int n)
	{
		System.out.print(n+" ");
		
		if(n==1)
			return;
		
		if(n%2==1)
			threeNPlusOne(3*n+1);
		
		else
			threeNPlusOne(n/2);
	}
	public static void main(String[] args) {

		threeNPlusOne(100);
	}

}
