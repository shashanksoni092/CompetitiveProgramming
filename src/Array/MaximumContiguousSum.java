package Array;

import java.util.Scanner;

public class MaximumContiguousSum {

	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static int MaxSum(int array[])
	{
		int best=0;
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(sum+array[i]<0)
				sum=0;
			
			else
				sum +=array[i];
			
			best=max(best,sum);
		}
		
		return best;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int array[]=new int[n];
		
		System.out.println("Enter array values");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int best=MaxSum(array);
		System.out.println(best);
	}

}
