package Recursion;

public class LinearSearch {

	public static void f(int index,int array[],int key)
	{
		if(index==array.length)
		{
			System.out.println("Not Found");
			return;
		}
		if(array[index]==key)
		{
			System.out.println("Found");
			return;
		}
		f(index+1,array,key);
	}
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7};
		
		f(0,array,9);
	}

}
