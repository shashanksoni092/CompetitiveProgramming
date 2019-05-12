package Recursion;

public class Permutation2 {

	public static void Permutation(String str,int i)
	{
		
		if(str.charAt(i)=='\0')
		{
			System.out.println(str);
			return;
		}
		
		for(int j=i;str.charAt(j)!='\0';j++)
		{
			str=swap(str,i,j);
			Permutation(str, i+1);
			str=swap(str,i,j);
		}
		
	}
	public static String swap(String str,int i,int j)
	{
		StringBuilder sb = new StringBuilder(str); 
        sb.setCharAt(i, str.charAt(j)); 
        sb.setCharAt(j, str.charAt(i)); 
        return sb.toString(); 
	}
	public static void main(String[] args) {

		String str="abcd"+'\0';
		Permutation(str, 0);
		
	}

}
