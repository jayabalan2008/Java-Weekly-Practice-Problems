import java.util. *;
public class Main {
    public static void main(String[]x) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), e = 0, o = 0;
        for (int i = 0; i < n; i ++)if (s.nextInt() % 2 == 0)e ++;
        else o ++;
        System.out.println("Even: " + e);
        System.out.println("Odd: " + o);
    }
}
