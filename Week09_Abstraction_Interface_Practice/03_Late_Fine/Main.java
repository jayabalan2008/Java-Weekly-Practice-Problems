import java.util. *;
abstract class LibraryItem {
    String title;
    int days;
    LibraryItem(String t, int d) {
        title = t;
        days = d;
    }
    abstract double fine();
}
class Book extends LibraryItem {
    Book(String t, int d) {
        super(t, d);
    }
    double fine() {
        return 2.0 * days;
    }
}
class DVD extends LibraryItem {
    DVD(String t, int d) {
        super(t, d);
    }
    double fine() {
        return Math.min(50, 5.0 * days);
    }
}
class Magazine extends LibraryItem {
    Magazine(String t, int d) {
        super(t, d);
    }
    double fine() {
        return days;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double total = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase(), title = s.next();
            int d = s.nextInt();
            LibraryItem x = switch (t) {
                case "BOOK"- > new Book(title, d);
                case "DVD"- > new DVD(title, d);
                case "MAGAZINE"- > new Magazine(title, d);
                default- > throw new IllegalArgumentException(t);
            };
            double f = x.fine();
            total +=f;
            System.out.printf("%s: %.2f%n", title, f);
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}
