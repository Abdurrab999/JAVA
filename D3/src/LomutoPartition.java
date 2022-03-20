import java.util.*;
public class LomutoPartition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		int l=0,h=s-1;
		int pivot=arr[h]; //Here the pivot is always the last element
		int i=l-1;
		int temp=0;
		for(int j=l;j<h;j++) {
			if(arr[j]<pivot)
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
//		Swap the first element of greater window with h
		temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		System.out.print(i+1);
		
		

	}

}
