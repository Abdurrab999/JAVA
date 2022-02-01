public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char blacksquare = '\u25A1';
		char whitesquare = '\u25A0';
		for(int j=0;j<4;j++) {
			for(int i=0;i<4;i++)
			{
				System.out.print(whitesquare+" "+blacksquare+" ");
			}
			System.out.println();
			for(int i=0;i<4;i++)
			{
				System.out.print(blacksquare+" "+whitesquare+" ");
			}
			System.out.println();
		}
		
	}

}