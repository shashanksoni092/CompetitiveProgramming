//we are given some numbers that is from 1 to 49.we are required to find set of different sets of 
//6 numbers arranged in ascending order.
//example-[1,2,3,4,5,31],[1,2,3,4,52],....,[3,4,5,6,7,21,32]......
//Since it is Brute Force and hence we require 6 loops

package MathsSTL;

public class BruteForceAdhoc {


	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,35,38,42,45};
		int n=a.length;
		long starttime=System.nanoTime();
		for(int i=0;i<n-5;i++)
		{
			for(int j=i+1;j<n-4;j++)
			{
				for(int k=j+1;k<n-3;k++)
				{
					for(int l=k+1;l<n-2;l++)
					{
						for(int m=l+1;m<n-1;m++)
						{
							for(int o=m+1;o<n;o++)
							{
								System.out.println(a[i]+","+a[j]+","+a[k]+","+a[l]+","+
										a[m]+","+a[o]);
							}
						}
					}
				}
			}	
		}
		long endtime=System.nanoTime();
		System.out.println("Total time:"+(float)(endtime-starttime)/1000000000);
	}
}

