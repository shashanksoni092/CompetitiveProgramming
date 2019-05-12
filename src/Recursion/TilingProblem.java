package Recursion;

public class TilingProblem {

	public static int n;
	public static int Tile[];
	public static int Tiling(int a)
	{
		if(a<4)
		{
			Tile[a]=1;
			return Tile[a];
		}
		
		else if(a==4)
		{
			Tile[a]=2;
			return Tile[a];
		}
		
		else
		{
			if(Tile[a]==-1 || Tile[a]==0)
			Tile[a]=Tiling(a-1)+ Tiling(a-4);
			return Tile[a];
			//return Tiling(a-1)+Tiling(a-4);
		}
	}
	public static void main(String[] args) {

		n=1500;
		Tile=new int[n+1];
		int res=Tiling(n);
		System.out.println(res);
	}

}
