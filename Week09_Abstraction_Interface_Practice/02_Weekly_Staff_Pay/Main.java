import java.util. *;
abstract class Staff {
    String name;
    Staff(String n) {
        name = n;
    }
    abstract double pay();
}
class FullTime extends Staff {
    double salary;
    FullTime(String n, double x) {
        super(n);
        salary = x;
    }
    double pay() {
        return salary;
    }
}
class Hourly extends Staff {
    double hours, rate;
    Hourly(String n, double h, double r) {
        super(n);
        hours = h;
        rate = r;
    }
    double pay() {
        return Math.min(hours, 40) * rate + Math.max(0, hours-40) * rate * 1.5;
    }
}
class Intern extends Staff {
    double stipend;
    Intern(String n, double s) {
        super(n);
        stipend = s;
    }
    double pay() {
        return stipend;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double total = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase(), name = s.next();
            Staff a = switch (t) {
                case "FULLTIME"- > new FullTime(name, s.nextDouble());
                case "HOURLY"- > new Hourly(name, s.nextDouble(), s.nextDouble());
                case "INTERN"- > new Intern(name, s.nextDouble());
                default- > throw new IllegalArgumentException(t);
            };
            double p = a.pay();
            total +=p;
            System.out.printf("%s: %.2f%n", name, p);
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}
