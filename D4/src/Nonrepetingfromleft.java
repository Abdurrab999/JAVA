import java.util.*;
import java.io.*;
//Eg - String = abdurrab
//	   Output = 2(index of 'd')
import java.lang.*;
class Nonrepetingfromleft
{
	public static void main(String args[]) {
		final int CHAR=256;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count[]=new  int[CHAR];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				System.out.println(i);
				return;
			}
				
			
		}
		System.out.println("-1");
		
		
	}
}