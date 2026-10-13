import java.util. *;
abstract class Connection {
    double units;
    Connection(double u) {
        units = u;
    }
    abstract double bill();
}
class Home extends Connection {
    Home(double u) {
        super(u);
    }
    double bill() {
        return Math.min(units, 100) * 5 + Math.max(0, units-100) * 7;
    }
}
class Shop extends Connection {
    Shop(double u) {
        super(u);
    }
    double bill() {
        return units * 8 + 100;
    }
}
class Factory extends Connection {
    Factory(double u) {
        super(u);
    }
    double bill() {
        return Math.max(1000, units * 6);
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase();
            Connection c = switch (t) {
                case "HOME"- > new Home(s.nextDouble());
                case "SHOP"- > new Shop(s.nextDouble());
                case "FACTORY"- > new Factory(s.nextDouble());
                default- > throw new IllegalArgumentException(t);
            };
            double b = c.bill();
            sum +=b;
            System.out.printf("%s: %.2f%n", t, b);
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
