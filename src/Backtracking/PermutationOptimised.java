package Backtracking;

import java.util.Scanner;

public class PermutationOptimised {

	public static void Permutation(int i,int n,int arr[],int table[])
	{
		if(i==n)
		{
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[k]);
			}
			
			System.out.println();
			return;
		}
		
		
		for(int k=0;k<n;k++)
		{
		
			int temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
			
			Permutation(i+1, n, arr, table);
			
			int temp1=arr[k];
			arr[k]=arr[i];
			arr[i]=temp1;
		}
	}
	private static void swap(int i, int k, int[] arr, int[] table) {
	
		int temp=arr[k];
		arr[k]=table[i];
		table[i]=temp;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int table[]=new int[n];
		
		Permutation(0,n,arr,table);
	}

}
