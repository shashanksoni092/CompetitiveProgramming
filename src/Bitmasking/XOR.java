package Bitmasking;

import java.util.*;
import java.io.*;
public class XOR {
    public static void main(String args[]) throws IOException{
System.out.println(34%1000000007);
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
  
  BufferedReader br=new BufferedReader(new
        InputStreamReader(System.in));
  
  String a=br.readLine();
  String b=br.readLine();
  //System.out.println("hello");
  
  for(int j=0;j<a.length();j++)
  {
    //System.out.println(j);
  
    int first=Integer.parseInt(String.valueOf(a.charAt(j)));
    int second=Integer.parseInt(String.valueOf(b.charAt(j)));
    //System.out.println();
    System.out.print(first^second);
  }
  
    System.out.println();
  
}


    }
}