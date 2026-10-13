import java.util. *;
import java.math. *;
public class Main {
    public static void main(String[]x) {
        int n = new Scanner(System.in).nextInt();
        if (n<0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= n; i ++)f = f.multiply(BigInteger.valueOf(i));
        System.out.println(f);
    }
}
