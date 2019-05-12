package Backtracking;

import java.util.Scanner;

public class BinaryValues {

	public static void BinaryValues(int i,int n,int arr[])
	{
		//Base Case
		if(i==n)
		{
			//print the array
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[k]);
			}
			System.out.println();
			return;
		}
		
		arr[i]=0;
		BinaryValues(i+1, n, arr);
		
		arr[i]=1;
		BinaryValues(i+1, n, arr);
		
	
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		BinaryValues(0,n, arr);
		
	}

}
