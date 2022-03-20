import java.util.*;
import java.io.*;
import java.lang.*;
class Tester
{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();
		String pat=sc.nextLine();
		int m=txt.length();
		int n=pat.length();
		int end=n;
		for(int i=0;i<=m-n;i++ ) {
			if(pat.equals(txt.substring(i,end))) {
				System.out.print(i+" ");
			}
			end++;
		}
		
		
			
		
		
	}
}