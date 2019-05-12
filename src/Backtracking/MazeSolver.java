package Backtracking;

public class MazeSolver {

static int count=0;	
	public static boolean MazeSolver(char in[][],int out[][],int i,int j,int m,int n)
	{
		//Base case
		if(i==m && j==n)
		{
			
			count++;
			out[i][j]=1;
			//Print the configuration
			for(int p=0;p<=m;p++)
			{
				for(int q=0;q<=n;q++)
				{
					if(out[p][q]==1)
					{
						System.out.print("1 ");
					}
					else {
						System.out.print("X ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			return true;
		}
		
		
		//Bound cases 
		if(i>m || j>n)
		{
			return false;
		}
		
		if(in[i][j]=='X')
			return false;
		
		
		//Recursive case
		
		//Assume current position is right ie out[i][j]=1
		out[i][j]=1;
		//System.out.println("Before out["+i+"]["+j+"]="+out[i][j]);
		
		//Check right path
		boolean right=MazeSolver(in, out, i, j+1, m, n);
		
		//check down path
		boolean down=MazeSolver(in, out, i+1, j, m, n);
		
		out[i][j]=0;//Unique path and Backtracking
		
		if(right==true || down==true)
			return true;
		
		//System.out.println("After out["+i+"]["+j+"]="+out[i][j]);
		
		return false;
		
		
	}
	public static void main(String[] args) {

		int out[][]=new int[4][4];
		char in[][]= {{'1','1','1','1'},
					  {'1','X','X','1'},
					  {'1','1','1','X'},
					  {'1','1','1','1'}};
					  
		MazeSolver(in, out, 0, 0, 3, 3);
		System.out.println("The total configuration :"+count);
		
	}

}
