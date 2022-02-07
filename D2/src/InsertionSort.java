import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array to be sorted");
		int n=sc.nextInt(); //Size of array
		int arr[]=new int[n]; //Created of array size n
		//Taking input
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int temp;
		//To Sort
		for(int i=1;i<n;i++)
			{
				temp=arr[i];		//Store the element to be inserted in a temporary variable
				int j=i-1;			//To compare the previous element
				while(j>=0 && arr[j]>temp)
				{
				arr[j+1]=arr[j]; //Shift one place right to create a place to insert the right element
				j--;			
				}
				arr[j+1]=temp;
			}
		//To print the elements
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
