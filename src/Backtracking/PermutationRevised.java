package Backtracking;

import java.util.Scanner;

public class PermutationRevised {

	public static void Permutation(int i,int n,int arr[],int table[])
	{
		if(i==n)
		{
			for(int k=0;k<n;k++)
			{
				System.out.print(table[k]);
			}
			
			System.out.println();
			return;
		}
		
		
		for(int k=0;k<n;k++)
		{
			if(arr[k]==-1)			//Prevent Visiting	
				continue;
			table[i]=arr[k];		//Path Building
			arr[k]=-1;				//Set
			Permutation(i+1, n, arr, table);
			arr[k]=table[i];		//reset
			
		}
		
		
		
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
