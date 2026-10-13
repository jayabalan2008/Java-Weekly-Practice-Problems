import java.util. *;
abstract class Journey {
    double d;
    Journey(double d) {
        this.d = d;
    }
    abstract double fare();
}
class Bus extends Journey {
    Bus(double d) {
        super(d);
    }
    double fare() {
        return Math.min(10, 2 + .1 * d);
    }
}
class Train extends Journey {
    Train(double d) {
        super(d);
    }
    double fare() {
        return 3 + .15 * d;
    }
}
class Metro extends Journey {
    double peak;
    Metro(double d, double p) {
        super(d);
        peak = p;
    }
    double fare() {
        return (1.5 + .2 * d) * peak;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase();
            double d = s.nextDouble();
            Journey j = switch (t) {
                case "BUS"- > new Bus(d);
                case "TRAIN"- > new Train(d);
                case "METRO"- > new Metro(d, s.nextDouble());
                default- > throw new IllegalArgumentException(t);
            };
            double f = j.fare();
            sum +=f;
            System.out.printf("%s: %.2f%n", t, f);
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
