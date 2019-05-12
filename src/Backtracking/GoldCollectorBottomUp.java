package Backtracking;

import java.util.Scanner;

public class GoldCollectorBottomUp {

	public static int GoldCollector(int n,int arr[],int Table[])
	{
		
		Table[0]=arr[0];
		Table[1]=Math.max(Table[0], arr[1]);
		
		for(int i=2;i<n;i++)
		{
		
			Table[i]=Math.max(Table[i-1], Table[i-2]+arr[i]);
		}
		
		return Table[n-1];
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  value of n");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int memo[]=new int[n+1];
		
		System.out.println("Enter the array value");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("The array is:-");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		for(int i=0;i<n;i++)
			memo[i]=-1;
		
		
		int res=GoldCollector(n, arr, memo);
		System.out.println();
		System.out.println("Memo value is:-");
		for(int i=0;i<n;i++)
			System.out.println(memo[i]);
		
		System.out.println("The result is:-");
		System.out.println(res);	
		
	}

}
