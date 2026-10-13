import java.util. *;
abstract class Delivery {
    double w, d;
    Delivery(double w, double d) {
        this.w = w;
        this.d = d;
    }
    abstract double fee();
}
class Standard extends Delivery {
    Standard(double w, double d) {
        super(w, d);
    }
    double fee() {
        return 5 + .5 * w + .1 * d;
    }
}
class Express extends Delivery {
    Express(double w, double d) {
        super(w, d);
    }
    double fee() {
        return 15 + w + .2 * d;
    }
}
class International extends Delivery {
    double customs;
    International(double w, double d, double c) {
        super(w, d);
        customs = c;
    }
    double fee() {
        return 25 + 2 * w + .5 * d + customs;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase();
            double w = s.nextDouble(), d = s.nextDouble();
            Delivery x = switch (t) {
                case "STANDARD"- > new Standard(w, d);
                case "EXPRESS"- > new Express(w, d);
                case "INTERNATIONAL"- > new International(w, d, s.nextDouble());
                default- > throw new IllegalArgumentException(t);
            };
            double f = x.fee();
            sum +=f;
            System.out.printf("%s: %.2f%n", t, f);
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
