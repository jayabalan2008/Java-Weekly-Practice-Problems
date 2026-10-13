import java.util. *;
abstract class Booking {
    static final double FEE = 50;
    double distance;
    Booking(double d) {
        distance = d;
    }
    abstract double baseFare();
    final double total() {
        return baseFare() + FEE;
    }
}
class Bus extends Booking {
    Bus(double d) {
        super(d);
    }
    double baseFare() {
        return 2 * distance;
    }
}
class Train extends Booking {
    Train(double d) {
        super(d);
    }
    double baseFare() {
        return 1.5 * distance;
    }
}
class Flight extends Booking {
    Flight(double d) {
        super(d);
    }
    double baseFare() {
        return 2500 + 4 * distance;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double total = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase();
            double d = s.nextDouble();
            Booking b = switch (t) {
                case "BUS"- > new Bus(d);
                case "TRAIN"- > new Train(d);
                case "FLIGHT"- > new Flight(d);
                default- > throw new IllegalArgumentException(t);
            };
            double amount = b.total();
            total +=amount;
            System.out.printf("%s: %.2f%n", t, amount);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
