import java.time. *;
import java.util. *;
class Borrowable {
    final int days;
    Borrowable(int d) {
        days = d;
    }
    LocalDate due(LocalDate today) {
        return today.plusDays(days);
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine().trim());
        LocalDate today = LocalDate.parse("2023-10-26");
        for (int i = 0; i < n; i ++) {
            String line = s.nextLine().trim();
            String type = line.substring(0, line.indexOf(' '));
            String title = line.substring(line.indexOf(' ') + 1).replace("\"", "");
            int days = switch (type) {
                case "BOOK"- > 14;
                case "DVD"- > 7;
                case "MAGAZINE"- > 3;
                default- > throw new IllegalArgumentException(type);
            };
            System.out.println(title + ": " + new Borrowable(days).due(today));
        }
    }
}
