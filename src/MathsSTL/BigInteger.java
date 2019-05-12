///
package MathsSTL;

public class BigInteger {

	
	
	public static void main(String []args) throws CloneNotSupportedException
	{
		//int array[]={1,1,0,1,0,1,0,1,1,1,0,1,1,0,1};
		//int array[]={1,1,0,1,1,1,0,0,1,1,1,1};
		int array[]={1,0,1,1,1,0,1,0,1,1};
		
		int max = 0,count=0,previous=0,flag=0,next=0,first=0;
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]==1)
			{
			
				
				if(flag==0 && first==0)
				{
					previous++;
				}
				else {
					next++;
				}
				
				
			}
			
			else if(array[i]==0 && array[i-1]==1 && array[i+1]==1 && flag==0)
			{
				flag=1;
				
			}
			else if(array[i]==0 && array[i-1]==0)
			{
				previous=0;
				next=0;
				flag=0;
			}
			else {
				count=previous+next+1;
				if(max<count)
					max=count;
				previous=next;
				next=0;
				flag=0;
				first=1;
			}
			if(i==array.length-1)
			{
				
				count=previous+next+1;
				if(max<count)
					max=count;
			}
		}
		System.out.println(max);
		System.out.println(Integer.BYTES*8);
		
		
	}
}
