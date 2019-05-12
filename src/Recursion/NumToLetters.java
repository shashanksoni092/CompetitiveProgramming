package Recursion;

import java.util.HashMap;

public class NumToLetters {

	
	public static void f(int num,HashMap<Integer,String>a)
	{
		if(num==0)
			return ;
		
		else {
			
			f(num/10,a);
			System.out.print(a.get(num%10)+" ");
		}
		
	}
	
	public static void main(String[] args)
	{
		HashMap<Integer,String>a=new HashMap<Integer,String>();
		a.put(0, "Zero");
		a.put(1, "One");
		a.put(2, "Two");
		a.put(3, "Three");
		a.put(4, "Four");
		a.put(5, "Five");
		a.put(6, "Six");
		a.put(7, "Seven");
		a.put(8, "Eight");
		a.put(9, "Nine");
		
		f(2048,a);
	}
}
