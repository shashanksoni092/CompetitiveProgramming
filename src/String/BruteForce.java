package String;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Main String");
		String T=sc.nextLine();	
		
		System.out.println("Enter the Pattern String");
		String P=sc.nextLine();	
		
		int firstOccurence=FirstOccurence(T,T.length(),P,P.length());
		
		System.out.println(firstOccurence);
		
		
	}

	private static int FirstOccurence(String t, int n, String p, int m) {
		
		for(int i=0;i<=n-m;i++)
		{
			int j=0;
			while(j<m && t.charAt(i+j)==p.charAt(j))
				j++;
			
			if(j==m)
				return i;
		}
		
		return -1;
	}

}
