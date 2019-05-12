package Recursion;

public class TilingProblemChallenge {

	public static int n;
	public static int m;
	public static int Tile[];
	public static int Tiling(int b,int a)
	{
		if(b<0 || a< 0)
			return 0;
		
		if(b==0 || a==0)
			return 0;
		
		if(b>a)
		{
			Tile[a]=1;
			return Tile[a];
		}
		else if(a==b)
		{
			Tile[a]=2;
			return Tile[a];

		}
		
		else {
			
			if(Tile[a]==-1 || Tile[a]==0)
			Tile[a]=Tiling(b,a-1)+ Tiling(b,a-b);
			return Tile[a];
			
		}
		
	}
	public static void main(String[] args) {

		n=4;
		Tile=new int[n+1];
		int result=Tiling(4,4);
		int res1=(int) (result%(Math.pow(10,9)+7));
		System.out.println(res1);
		
	}

}


/*
import java.util.*;
public class Main {
	public static int n;
	public static int m;
	public static int Tile[];
	
	public static int Tiling(int b,int a)
	{
		if(b<0 || a< 0)
			return 0;
		
		if(b==0 || a==0)
			return 0;
			
		if(b>a)
		{
			Tile[a]=1;
			return Tile[a];
		}
		else if(a==b)
		{
			Tile[a]=2;
			return Tile[a];

		}
		
		else {
			
			if(Tile[a]==-1 || Tile[a]==0)
			Tile[a]=Tiling(b,a-1)+ Tiling(b,a-b);
			return Tile[a];
			
		}
		
	}

    public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);	
	int t=sc.nextInt();

	for(int i=0;i<t ;i++)
	{
		int n=sc.nextInt();
		int m=sc.nextInt();
		Tile=new int[n+1];
		int result=Tiling(m,n);
		int res1=(int) (result%(Math.pow(10,9)+7));
		System.out.println(res1);
	}

    }
}
*/