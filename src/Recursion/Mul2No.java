package Recursion;

public class Mul2No {

	public static long product(long x,long y)
	{
		
		if(x<y)
			return product(y,x);
		
		else if(y!=0)
			return (x+product(x,y-1));
		
		else
			return 0;
		
	}
	public static void main(String[] args) {

		System.out.println(product(1000000,5000));
	}

}
