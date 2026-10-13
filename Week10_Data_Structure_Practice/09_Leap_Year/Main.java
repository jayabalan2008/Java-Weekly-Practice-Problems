import java.util. *;
public class Main {
    public static void main(String[]x) {
        int y = new Scanner(System.in).nextInt();
        System.out.println((y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))?"Leap year":"Not a leap year");
    }
}
