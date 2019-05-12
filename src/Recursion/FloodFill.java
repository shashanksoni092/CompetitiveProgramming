package Recursion;

import java.util.Scanner;

public class FloodFill {

	public static int arr[][];
	public static void FloodFill(int x, int y, int m, int n, int[][] grid){
		
		System.out.println(x+" "+y);
		
		
		if(x < 0 || y < 0 || x >= n || y >= m || grid[y][x] == 0)
			return;
		
		
		grid[y][x] = 0;
		
		FloodFill(x - 1, y, m, n, grid);
		FloodFill(x, y - 1, m, n, grid);
		FloodFill(x, y + 1, m, n, grid);
		FloodFill(x + 1, y, m, n, grid);
		
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		arr=new int[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		
		FloodFill(0,0,m-1,n-1,arr);
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
