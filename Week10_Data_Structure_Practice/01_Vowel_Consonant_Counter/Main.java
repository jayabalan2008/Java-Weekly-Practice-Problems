import java.util. *;
public class Main {
    public static void main(String[]x) {
        String w = new Scanner(System.in).next();
        int v = 0;
        for (char c:w.toLowerCase().toCharArray())if ("aeiou".indexOf(c) >= 0)v ++;
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + (w.length()-v));
    }
}
