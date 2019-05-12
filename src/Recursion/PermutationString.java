package Recursion;

public class PermutationString {

	public static void Permutation(char str[],int i)
	{
		
		if(str[i]=='\0')
		{
			System.out.println(str);
			return;
		}
		
		for(int j=i;str[j]!='\0';j++)
		{
			
			str=swap(str,i,j);
			Permutation(str, i+1);
			
			//Backtracking to convert back our array into original array
			str=swap(str,i,j);
			
		}
		
	}
	
	public static char[] swap(char str[],int i,int j)
	{
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		return str;
	}
	public static void main(String[] args) {

		char str[]={'a','b','c','d','\0'};
		//System.out.println(str[3]);
		Permutation(str, 0);
		
	}

}
