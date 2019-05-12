//Sort the strings where 
//Ex between bat and batsman, batsman should come
//input:-
//3
//bat
//apple
//batsman
//n:-no of strings
//Enter the strings
//output:-order of sorted strings
//apple
//batsman
//bat
package STL;

import java.util.*;

public class StringSort{
  
    public static void main(String args[]) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    String letters[]=new String[n];
   
    for(int i=0;i<n;i++)
    {
    	letters[i]=sc.next();
    }
     
    for(int i=0;i<n;i++)
    {
    	
    	for(int j=i+1;j<n;j++)
    	{
    		//int com=(letters[i].compareTo(letters[j]));
    		char a[]=letters[i].toCharArray();
    		char b[]=letters[j].toCharArray();
    		for(int k=0;k<Math.max(a.length, b.length);k++)
    		{
    			if(a[k]>b[k])
    			{
    				//System.out.println(letters[i] +" and "+letters[j]);
    				String swap=letters[i];
        			letters[i]=letters[j];
        			letters[j]=swap;
        			break;
    			}
    			else if(a[k]<b[k]){
    				break;
    			}
    			else {
    				//Preserving bat and batsman order
    				int z=Math.min(a.length,b.length);
    				int x=a.length;
    				int y=b.length;
    				if(k==z-1)
    				{
    					if(x>y)
    					{
    						
    					}
    					else {
    						String swap=letters[i];
    	        			letters[i]=letters[j];
    	        			letters[j]=swap;
    	        			break;
    					}
    				}
    			}
    		}
    		
    		
    		
    
    	}
    }
    
    for(int i=0;i<n;i++)
    {
    	System.out.println(letters[i]);
    }
         
    }

	
    
    
}