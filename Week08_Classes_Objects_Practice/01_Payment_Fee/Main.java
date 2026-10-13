import java.util. *;
interface Payment {
    double adjusted(double a);
}
class Card implements Payment {
    public double adjusted(double a) {
        return a * 1.02;
    }
}
class Wallet implements Payment {
    public double adjusted(double a) {
        return a * 1.01;
    }
}
class BankTransfer implements Payment {
    public double adjusted(double a) {
        return a;
    }
}
public class Main {
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double total = 0;
        for (int i = 0; i < n; i ++) {
            String t = s.next().toUpperCase();
            double a = s.nextDouble();
            Payment p = switch (t) {
                case "CARD"- > new Card();
                case "WALLET"- > new Wallet();
                case "BANKTRANSFER"- > new BankTransfer();
                default- > throw new IllegalArgumentException(t);
            };
            double r = p.adjusted(a);
            total +=r;
            System.out.printf("%s: %.2f%n", t, r);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
