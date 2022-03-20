import java.util.*;
class ReverseStringWords
{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String st[]=str.split("\\s");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}
	}
}