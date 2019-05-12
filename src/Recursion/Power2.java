package Recursion;

public class Power2 {

	public static int power(int a,int b)
	{
		if(b==0)
			return 1;
		if(b%2==0)
			return power(a,b/2)*power(a,b/2);
		else
			return a*power(a,b/2)*power(a,b/2);
	}
	public static void main(String[] args) {
		
		System.out.println(power(2,10));
		
	}

}
