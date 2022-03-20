import java.util.*;
import java.io.*;
public class MergeandSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of two arrays");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[m];
		
		System.out.println("Enter two sorted array ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		int i=0;
		int j=0;
		while(i<n &&j<m)
		{
			if(arr[i]<=arr2[j]) {
				System.out.print(arr[i]+" ");
				i++;
			}
			else {
				System.out.print(arr2[j]+" ");
				j++;
			}
				
		}
		while(i<n) {
			System.out.print(arr[i]+" ");
			i++;
		}
		while(j<m) {
			System.out.print(arr2[j]+" ");
			j++;
		}
			
	}

}
