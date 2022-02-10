//To find common elements between two arrays
import java.util.*;
public class CommonElements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of both array");
		//Size of both arrays
		int n=sc.nextInt();
		int m=sc.nextInt();
		//  Creating both arrays
		int ar[]=new int[n];
		int ar2[]=new int[m];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		for(int i=0;i<m;i++)
			ar2[i]=sc.nextInt();
		
		int i=0,j=0;
		while (i<n&&j<m){
			if(i>0 && ar[i]==ar[i-1]) {
				i++;
				continue;
			}
				
			if(ar[i]<ar2[j])
				i++;
			else if(ar[i]>ar2[j])
				j++;
			else {
				System.out.print(ar[i]+" ");
				i++;
				j++;
			}
				
		}

	}

}
