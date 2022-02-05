import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array to be sorted");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int temp;
		for(int i=1;i<n;i++)
		{
			temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
