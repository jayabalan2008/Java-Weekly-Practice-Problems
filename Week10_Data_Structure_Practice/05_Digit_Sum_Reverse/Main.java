import java.util. *;
public class Main {
    public static void main(String[]x) {
        long n = new Scanner(System.in).nextLong(), v = n, rev = 0, sum = 0;
        while (v > 0) {
            long d = v % 10;
            sum +=d;
            rev = rev * 10 + d;
            v /=10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + rev);
    }
}
