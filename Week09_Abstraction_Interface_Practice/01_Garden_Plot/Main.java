import java.util. *;
abstract class Plot {
    String owner;
    Plot(String o) {
        owner = o;
    }
    abstract double area();
}
class Circle extends Plot {
    double r;
    Circle(String o, double r) {
        super(o);
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
}
class Rectangle extends Plot {
    double l, w;
    Rectangle(String o, double l, double w) {
        super(o);
        this.l = l;
        this.w = w;
    }
    double area() {
        return l * w;
    }
}
class Triangle extends Plot {
    double b, h;
    Triangle(String o, double b, double h) {
        super(o);
        this.b = b;
        this.h = h;
    }
    double area() {
        return b * h / 2;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase(), o = s.next();
            Plot p = switch (t) {
                case "CIRCLE"- > new Circle(o, s.nextDouble());
                case "RECTANGLE"- > new Rectangle(o, s.nextDouble(), s.nextDouble());
                case "TRIANGLE"- > new Triangle(o, s.nextDouble(), s.nextDouble());
                default- > throw new IllegalArgumentException(t);
            };
            double a = p.area();
            sum +=a;
            System.out.printf("%s (%s): %.2f%n", o, t, a);
        }
        System.out.printf("Total Area: %.2f%n", sum);
    }
}
