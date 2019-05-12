package Recursion;

import java.util.Scanner;

public class SumUptoN {

	public static int sum(int n)
	{
		return (n==1)?1:n+sum(n-1);
		//or
		//return (x==1)?1:n+sum(n-1);
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=sum(n);
		System.out.println(res);
	}

}
