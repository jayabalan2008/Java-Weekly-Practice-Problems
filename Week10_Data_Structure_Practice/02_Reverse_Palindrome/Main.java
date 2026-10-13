import java.util. *;
public class Main {
    public static void main(String[]x) {
        String w = new Scanner(System.in).next();
        String r = new StringBuilder(w).reverse().toString();
        System.out.println(r + " - " + (w.equals(r)?"palindrome":"not a palindrome"));
    }
}
