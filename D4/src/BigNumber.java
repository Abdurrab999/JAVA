//We use BigInteger class for calculation of very big numbers .
import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger c=sc.nextBigInteger();
        BigInteger d=sc.nextBigInteger();
        System.out.println(c.add(d));
        System.out.println(c.multiply(d));
        
    }
}
