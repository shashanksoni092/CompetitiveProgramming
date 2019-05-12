package Backtracking;

import java.util.Scanner;

public class GoldCollector {

	public static int GoldCollector(int i,int n,int arr[],int Memo[])
	{
		
		if(i>=n)
		{
			return 0;
		}
		
		if(Memo[i]==-1)
		{
		//System.out.println("Hi");
		int a=GoldCollector(i+1, n, arr, Memo);
		int b=GoldCollector(i+2, n, arr, Memo)+arr[i];
		Memo[i]=Math.max(a, b);
		return Memo[i];
		}	
		
		else {
			return Memo[i];
		}
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
	
	
	int res=GoldCollector(0, n, arr, memo);
	System.out.println();
	System.out.println("Memo value is:-");
	for(int i=0;i<n;i++)
		System.out.println(memo[i]);
	
	System.out.println("The result is:-");
	System.out.println(res);	
	}

}
