package STL;

import java.util.Arrays;
import java.util.Scanner;

class MedianOfTwoDifferentArray {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 int m=sc.nextInt();
			int nums1[]=new int[n];
			int nums2[]=new int[m];
			 
			 for(int i=0;i<n;i++)
			 {
				 nums1[i]=sc.nextInt();
			 }
			 
			 for(int i=0;i<m;i++)
			 {
				 nums2[i]=sc.nextInt();
			 }
		//int []nums1 = null;
		//int []nums2 = null;
		
		double a=MedianOfTwoDifferentArray(nums1, nums2);
		System.out.println(a);
	}
    public static double MedianOfTwoDifferentArray(int[] nums1, int[] nums2) {
 
       
		    
        int nums3[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            nums3[i]=nums1[i];
        }
		 for(int k=0;k<nums2.length;k++)
		 {
             nums3[nums1.length+k]=nums2[k];
		 }
		 
		
		 Arrays.sort(nums3);
		
		 for(int i=0;i<nums3.length;i++)
		 {
			 System.out.print(nums3[i]+" ");
		 }
		 double median=0;
		 if(nums3.length%2==0)
		 {
			median=(float)(nums3[(nums3.length-1)/2]+nums3[(nums3.length-1)/2+1])/2;
		 }
		 else {
			 
		    median=nums3[nums3.length/2];
		 }
        return median;
    }
} 	