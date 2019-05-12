package Recursion;
//DP Fibonacci
public class Fibonaci {

	static int fib[];
	static int n;
	public static int f(int a)
	{
		if(a==0 || a==1)
		{
			fib[a]=a;
			return fib[a];
		}
		
		else
		{
			if(fib[a]==-1 || fib[a]==0)
			fib[a]=f(a-1)+f(a-2);
			return fib[a];
		}	
	}
	
	public static void main(String[] args)
	{
		n=1000;
		fib=new int[n+1];	
		System.out.println(f(n));
		for(int i=0;i<=n;i++)
			System.out.println(fib[i]);
	}
}
