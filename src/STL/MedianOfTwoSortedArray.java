//We are given two sorted arrays of same size n.
//Find the median of an array formed after merging these two sorted arrays.
//Input Format:

//First line contains the input n. Second and Third line contains n space separated integers.
//Output:
//Print the median in a single line.
package STL;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		 int []array1=new int[2*n];
		 int []array2=new int[n];
		 
		 for(int i=0;i<n;i++)
		 {
			 array1[i]=sc.nextInt();
		 }
		 
		 for(int i=0;i<n;i++)
		 {	
			 array2[i]=sc.nextInt();
		 }
		
		 //array1=new int[2*n];
		 for(int k=0;k<n;k++)
		 {
			 array1[n+k]=array2[k];
		 }
		 
		
		 Arrays.sort(array1);
		
		 for(int i=0;i<2*n;i++)
		 {
			 System.out.println(array1[i]);
		 }
		 
		 if(array1.length%2==0)
		 {
			 System.out.println((array1[(array1.length-1)/2]+array1[(array1.length-1)/2+1])/2);
		 }
		 else {
			 
			 System.out.println(array1.length/2);
		 }	
	}

}
