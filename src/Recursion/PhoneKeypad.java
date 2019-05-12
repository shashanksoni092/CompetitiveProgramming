package Recursion;

public class PhoneKeypad {

	static String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
	public static void Phone(char in[],char out[],int i,int j)
	{
		//Basic Case
		if(in[i]=='\0')
		{
			out[j]=in[i];
			System.out.println(out);
			return;
		}
		
		//Recursive Case
		
		int digit=in[i]-'0';//ascii to number
		
		//To resolve null string ex.123 wil not print anything bcoz 1 is null
		if(digit==0 ||digit==1)
		{
			Phone(in, out, i+1, j);
		}
		
		for(int k=0;k<=keypad[digit].length()-1;k++)
		{
			out[j]=keypad[digit].charAt(k);
			Phone(in,out,i+1,j+1);
			
		}
		
	}
	public static void main(String[] args) {

		char in[]= {'2','1','2','\0'};
		char out[]=new char[in.length]; 
		Phone(in, out, 0, 0);
	}

}
