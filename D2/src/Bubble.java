import java.util.*;
public class Bubble {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sortt(arr,n);
	}
	static void sortt(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
		    }
		}
		System.out.print("Array After sorting is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
      }


}
