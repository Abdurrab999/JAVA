import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUnion {
    public static void main(String args[] ) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of both array ");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	
    	ArrayList<Integer> arr=new ArrayList<Integer>(a);
    	ArrayList<Integer> arr2=new ArrayList<Integer>(b);
    	
    	System.out.println("Enter the first Array ");
    	for(int i=0;i<a;i++)
    		arr.add(sc.nextInt());
    	System.out.println("Enter the second Array ");
    	for(int i=0;i<b;i++)
    		arr2.add(sc.nextInt());
//    	System.out.println(arr.size()+" "+arr2.size());
    	
    		
    	union(arr,arr2);
    	
    }
    static void union(ArrayList<Integer> arr,ArrayList<Integer> arr2)
    {
    	int i=0,j=0;
    	while(i<arr.size()&& j<arr2.size())
    	{
    		
    		if(i>0&&arr.get(i)==arr.get(i-1)) {
    			i++;
    			continue;}
    		if(j>0&&arr2.get(j)==arr2.get(j-1)){
    			j++;
    			continue;}
    		
        	
        	if(arr.get(i)<arr2.get(j)) {
        		System.out.print(arr.get(i)+" ");
        		i++;
        	}
        	else if(arr.get(i)>arr2.get(j)) {
        		System.out.print(arr2.get(j)+" ");
        		j++;
        	}
        	else
        	{
            		System.out.print(arr.get(i)+" ");
            		i++;
            		j++;
        	}
    	}
        	while(i<arr.size() ) {
        		if(i>0 && arr.get(i)!=arr.get(i-1))
        		System.out.print(arr.get(i)+" ");
        		i++;
        	}
        	while(j<arr2.size()) {
        		if(j>0 &&  arr2.get(j)!=arr2.get(j-1))
        		System.out.print(arr2.get(j)+" ");
        		j++;
        	}
        		
      }
}