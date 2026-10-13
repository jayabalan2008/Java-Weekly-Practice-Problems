import java.util. *;
public class Main {
    public static void main(String[]x) {
        long n = new Scanner(System.in).nextLong();
        boolean p = n > 1;
        for (long i = 2; p && i * i <= n; i ++)if (n % i == 0)p = false;
        System.out.println(n + (p?" is prime":" is not prime"));
    }
}
