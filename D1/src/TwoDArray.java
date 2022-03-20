//Transpose of a matrix
import java.util.*;
public class TwoDArray {

    public static void main(String[] args) 
    {    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of matrix");
    	int s=sc.nextInt();
    	int arr[][]=new int[s][s];
    	for(int i=0;i<arr.length;i++)
    		for(int j=0;j<arr[i].length;j++) {
    			arr[i][j]=sc.nextInt();
    		}
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<arr[i].length;j++)
    		{
    			System.out.print(arr[j][i]+" ");    	
    		}
    		System.out.println(); //Here it is used for changing the line after one row.
    	 }
    	
    }
}