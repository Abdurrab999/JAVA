import java.util.Scanner;

public class Findin2d {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of matrix");
    	int n=sc.nextInt();
    	int a[][]=new int[n][n];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			a[i][j]=sc.nextInt();
    		}
    	}
//    	int a[][]={ {10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//    	int num=29;
    	System.out.println("Enter the number to find");
    	int num=sc.nextInt();
    	int r=a.length;
    	int x=(a[0].length)-1;
    	int y=0;
    	while(x>=0&&y<r) {
    		if(a[x][y]==num) {
    			System.out.println(num+" is present at "+(x+1)+","+(y+1));
    			return;
    		}
    		else if(a[x][y]>num) {
    			x--;
    		}
    		else if(a[x][y]<num) {
    			y++;
    		}
    		
    	}
    	System.out.println("Number not found :(");
		return;
    	
    	
    	
    }
}