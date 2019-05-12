package DP;
import java.util.*;
import java.math.*;

public class Cell {

	
	
	public static int Operation(int n,int x)
	{
		System.out.println(n);
		if(n==x)
			return 0;
		else if(n>2*x)
			return -1;
		
		else
			return Math.min(2+Operation(n*2,x),Math.min(3+Operation(n+1,x) ,4+Operation(n-1,x)) );
		
		
	}
	public static void main(String[] args) {
		
		int res=Operation(1,7);
		System.out.println(res);
		
	}

}
