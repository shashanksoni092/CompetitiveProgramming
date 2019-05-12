package STL;
import java.util.*;

public class StringSortCustomComparator {
  
    public static void main(String args[]) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    String letters[]=new String[n];
   /*
    for(int i=0;i<n;i++)
    {
    	letters[i]=sc.next();
    }
     */
    //String[] strings = {"Here", "are","arent", "some", "sample", "strings", "to", "be", "sorted"};
    String[] strings = {"bat","apple","batsman"};
    
    Arrays.sort(strings,(s1,s2)->{
    	/*
    	int c = s2.length() - s1.length();
        if (c == 0)
          c = s1.compareToIgnoreCase(s2);
        
        return c;
        */
    	System.out.println("s1 is "+s1+" and s2 is "+s2);
    	
    	int x=s1.length();
    	int y=s2.length();
    	for(int i=0;i<Math.min(s1.length(), s2.length());i++)
    	{
    		if(s1.charAt(i)>s2.charAt(i))
    		{
    			String temp=s1;
    			s1=s2;
    			s2=temp;
    			break;
    			
    		}
    		else if(s1.charAt(i)<s2.charAt(i))
    		{
    			break;
    		}
    		else {
    			if(i==Math.min(s1.length(), s2.length())-1)
    			{
    				if(y>x)
    				{
    					String temp=s1;
    	    			s1=s2;
    	    			s2=temp;
    	    			break;
    				}
    			}
    		}
    	}
    	return s1.compareTo(s2);
    	
    });
    /*
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
    */
    for(int i=0;i<strings.length;i++)
    {
    	System.out.println(strings[i]);
    }
         
    }

	
    
    
}