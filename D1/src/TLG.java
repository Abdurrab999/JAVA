//Codechef problem
import java.util.*;
import java.lang.*;
class TLG
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int lead=0;
		int diff=0;
		int ark=0;
	    for(int i=0;i<n;i++)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        
	        diff=Math.abs(a-b);
	        
	        if(diff>lead){
	            lead=Math.max(diff,lead);
	            ark=(a>b)? 1 : 2;
	            }
	    }
		System.out.print(ark+" "+lead);
		
	}
}
