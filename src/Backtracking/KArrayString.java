package Backtracking;

import java.util.Scanner;

public class KArrayString {

	
	public static void KArrayString(int i,int n,String[]Basket,String[]arr)
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
		
		
		for(int a=0;a<Basket.length;a++)
		{
			arr[i]=Basket[a];
			KArrayString(i+1, n, Basket, arr);
		}
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of Basket");
		int m=sc.nextInt();
		String Basket[]=new String[m];
		
		System.out.println("Enter Basket value");
		for(int i=0;i<m;i++)
		{
			Basket[i]=sc.next();
		}
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		String arr[]=new String[n];
		
		KArrayString(0,n,Basket,arr);
		
	}

}
