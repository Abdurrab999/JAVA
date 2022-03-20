import java.util.Scanner;

public class HoarePartition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		int l=0,h=n-1,pivot=arr[0];
		int i=l-1;
		int j=h+1;
		
		while(true) {
			do {
				i++;}
				while(arr[i]<pivot);
			do {
				j--;}
				while(arr[j]>pivot);
			if(i>=j) {
				
				System.out.println(j);
					break;
					
			}
			
			int temp=0;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
		}

	}

}
