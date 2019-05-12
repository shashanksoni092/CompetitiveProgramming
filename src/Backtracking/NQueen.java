package Backtracking;

import java.util.Scanner;

public class NQueen {

	static int count=0;//counting no of configuration
	public static boolean Queen(boolean Board[][],int i,int n)
	{
		//Base Case
		if(i==n)
		{
		count++;
			for(int k=0;k<n;k++)
			{
				for(int l=0;l<n;l++)
				{
					if(Board[k][l])
						System.out.print("Q ");
					else
						System.out.print("- ");
				}
				System.out.println();
			}
			System.out.println();
			return false;//to generate all configurations
		}
		
		
		//Recursive Case
		for(int j=0;j<n;j++)
		{
			if(isSafe(Board,i,j,n)) {
				//System.out.println(i +" and "+j);
				Board[i][j]=true;
				
				//moving to next level
				boolean pos=Queen(Board,i+1,n);//if next level cant be able to put queen anywhere then return false
				
				if(pos==true)
					return true;
				
				//If pos==false then,Backtracking step
					Board[i][j]=false;
				
				
			}
			
		
		}
		return false;
		
	}
	private static boolean isSafe(boolean board[][], int i, int j,int n) {
		
		//Checking for same column
		for(int k=0;k<i;k++)
		{
			if(board[k][j]==true)
			{
				return false;
			}
	
		}
		
		
		//Left Diagonal
		int x=i;
		int y=j;
		while(x>=0 && y>=0)
		{
			//System.out.println("Inside left diagonal "+x+" and "+y);
			if(board[x][y]==true)
			{
				return false;
			}
			x--;
			y--;
			
		}
		
		//Right Diagonal
		
		x=i;
		y=j;
		while(x>=0 && y<n)
		{
			if(board[x][y])
			{
				return false;
			}
			x--;
			y++;
		}
		
		
		return true;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean board[][]=new boolean[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				board[i][j]=false;
			}
		}
		Queen(board,0,n);
		System.out.println("No of configuration "+count);
	}

}
