class MessWallet {
    private double balance;
    MessWallet(double b) {
        if (b < 0) {
            System.out.println("Warning: negative opening balance; starting at 0");
            b = 0;
        }
        balance = b;
    }
    public void topUp(double a) {
        if (a<=0) {
            System.out.println("Top-up rejected: amount must be positive");
        }
        else {
            balance +=a;
            System.out.println("Balance after top-up: " + balance);
        }
    }
    public void deduct(double a) {
        if (a<=0) {
            System.out.println("Deduct rejected: amount must be positive");
        }
        else if (a>balance) {
            System.out.println("Deduct rejected: insufficient balance");
        }
        else balance-=a;
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[]x) {
        MessWallet w = new MessWallet(500);
        w.topUp(200);
        w.deduct(1000);
        System.out.println("Final balance: " + w.getBalance());
    }
}
