import java.util. *;
public class Main {
    static void reverse(int[]a) {
        for (int l = 0, r = a.length-1; l < r; l ++, r--) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
        }
    }
    public static void main(String[]x) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i ++)a[i] = s.nextInt();
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
