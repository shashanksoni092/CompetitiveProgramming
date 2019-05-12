package Bitmasking;

public class Subsequence {

public static void GenerateNumbers(char array[])
{
	//pow(2,n)-1 can be written as (1<<n)-1
	//we'll generate numbers from 0 to 7
	int n=array.length;
	for(int i=0;i<=((1<<n)-1);i++)
	{
		//System.out.println(i);
		PrintSubsequence(array,i);
	}
	
	
}
	
private static void PrintSubsequence(char[] array, int num) 
{
	
	//suppose array is a b c and num=5 then it should print ac (1 0 1)
	
	int i=0;
	while(num>0)
	{
		int a=(num & 1);//?array[i]:"";
		if(a==1)
			System.out.print(array[i]);
		else
			System.out.print("");
		
		num=num>>1;
	i++;
	}
	System.out.println();
	
}

public static void main(String[] args)
{
	char string[]= {'a','b','c','d'};
	GenerateNumbers(string);
	
}

}
