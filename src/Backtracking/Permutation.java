package Backtracking;

import java.util.Scanner;

public class Permutation {

	
	public static void Permutation(int i,int n,int arr[],int table[])
	{
		if(i==n)
		{
			int flag=1;
			for(int k=0;k<n;k++)
			{
				for(int l=k+1;l<n;l++)
					if(table[k]==table[l])
						flag=0;;
					
			}
			if(flag==1)
			{
			for(int k=0;k<n;k++)
			{
				System.out.print(table[k]);
			}
			
			System.out.println();
			}
			return;
		}
		
		
		for(int k=0;k<n;k++)
		{
			table[i]=arr[k];
			Permutation(i+1, n, arr, table);
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
