package Recursion;

public class SubsequenceString {

	public static void Subsequences(char[] in,char[] out,int i,int j)
	{
		
		//Base case
		if(in[i]=='\0')
		{
			out[j]=in[i];
			System.out.println(out);
			return;
		}
		
		//Recursive case
		
		//1)Include ith index character
		out[j]=in[i];
		Subsequences(in,out,i+1,j+1);
		
		
		//2)Exclude ith index character
		Subsequences(in,out,i+1,j);
		
		
	}
	
	public static void main(String[] args) {

		char in[]= {'a','b','c','\0'};
		char out[]=new char[4];
		Subsequences(in, out, 0, 0);
	}

}
