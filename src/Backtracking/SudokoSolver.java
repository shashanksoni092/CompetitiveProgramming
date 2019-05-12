package Backtracking;

import java.util.Scanner;

public class SudokoSolver {

	//Global Variables
	public static int sudoko[][];
	public static int n;
	private static boolean sudokoSolver(int i, int j, int n) {
	
		//System.out.println(i+" "+j);
		//Base case
		if(i==n)
		{
			for(int x=0;x<n;x++)
			{
				for(int y=0;y<n;y++)
				{
					System.out.print(sudoko[x][y]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		//Edge case column
		if(j==n)
		{
			//System.out.println("what sir");
			//System.out.println(i+" "+j);
			return sudokoSolver(i+1, 0,n);
		}
		
		if(sudoko[i][j]!=0)
		{
			//System.out.println(sudoko[i][j] +" "+i+" "+j);
			return sudokoSolver(i, j+1, n);
		}
		
		//Recursive case
		for(int num=1;num<=n;num++)
		{
			if(canPutValue(i,j,num,n))
			{
				//System.out.println("hi sir");
				//System.out.println(i+" "+j);
				sudoko[i][j]=num;
				
				boolean CanSolveSudoko=sudokoSolver(i, j+1, n);
				
				if(CanSolveSudoko==true)
				{
					return true;
				}
				
			}
		}
		
		sudoko[i][j]=0;
		return false;
		
		
		
	}

	
	private static boolean canPutValue(int i, int j, int num, int n) {
		
		for(int c=0;c<n;c++)
		{
			if(sudoko[c][j]==num || sudoko[i][c]==num)
				return false;
		}
		
		int rn=(int) Math.sqrt(n);
		int sx=(int)((i/rn))*rn;
		int sy=(int)((j/rn))*rn;
		
		for(int a=sx ; a<sx+rn ; a++)
		{
			for(int b=sy ; b<sy+rn ; b++)
			{
				if(sudoko[a][b]==num)
				{
					//System.out.println("Hi");
					//System.out.println(sudoko[a][b]+ " "+a +" "+b);
					return false;
				}
			}
		}
			
		return true;
	}


	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter then value");
	n=sc.nextInt();
	
	sudoko=new int[n+1][n+1];
	System.out.println("Enter the sudoko values");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			sudoko[i][j]=sc.nextInt();
		}
	}
	
	sudokoSolver(0,0,n);
		
	}


	
}
