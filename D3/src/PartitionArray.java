import java.util.*;
public class PartitionArray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of Array ");
			int s=sc.nextInt();
			ArrayList<Integer> arr=new ArrayList<Integer>(s);
			for(int i=0;i<s;i++)
				arr.add(sc.nextInt());
			System.out.println("Enter the Partition Element ");
			int p=sc.nextInt();
			int l=0,h=s-1;
			int index=0;
			ArrayList<Integer> temp=new ArrayList<Integer>(h-l+1);
			for(int i=l;i<=h;i++ )	//copy the element less than pivot to left
			{
				if(arr.get(i)<arr.get(p)) {
					temp.add(index,arr.get(i));
					index++;
				}
			}
			for(int i=l;i<=h;i++) { //copy element equal to pivot
				if(arr.get(i)==arr.get(p)) {
					temp.add(index,arr.get(i));
					index++;
				}
			}
			int res=l+index-1; //Last Occurence of pivot
			for(int i=l;i<=h;i++) {    //copy element greater than pivot
				if(arr.get(i)>arr.get(p)) {
					temp.add(index, arr.get(i));
					index++;
				}
			}
			for(int i=l;i<=h;i++)   		//Copy element to orignal array
				arr.set(i,temp.get(i-l));
			System.out.println(res);
			
			
			
	}

}
