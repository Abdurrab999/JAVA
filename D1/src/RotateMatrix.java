import java.util.Scanner;

//Rotate a matrix by 90 degree
public class RotateMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];//creating an array of size of n
		//taking input
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
		//Transpose
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		//swaping the row
		int b=n-1;int t=0;
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				int temp=arr[t][j];
				arr[t][j]=arr[b][j];
				arr[b][j]=temp;
			}
			t++;
			b--;
		}
		//Printing the array
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
				
		}
		

	}

}
