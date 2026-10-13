import java.util. *;
public class Main {
    public static void main(String[]x) {
        int m = new Scanner(System.in).nextInt();
        char g = m >= 90?'A':m >= 75?'B':m >= 60?'C':m >= 40?'D':'F';
        System.out.println("Grade " + g);
    }
}
