class PiggyBank {
    private double savings = 0;
    private final String id;
    PiggyBank(String id) {
        this.id = id;
    }
    public boolean deposit(double amount) {
        if (amount<=0) {
            return false;
        }
        savings +=amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount<=0||amount>savings) {
            return false;
        }
        savings-=amount;
        return true;
    }
    public double getSavings() {
        return savings;
    }
    public String getId() {
        return id;
    }
}
public class Main {
    public static void main(String[]x) {
        PiggyBank p = new PiggyBank("PB-1");
        p.deposit(100);
        p.withdraw(30);
        System.out.println("Savings: " + p.getSavings());
        System.out.println("Withdraw 500 accepted: " + p.withdraw(500));
        System.out.println("Savings: " + p.getSavings());
    }
}
