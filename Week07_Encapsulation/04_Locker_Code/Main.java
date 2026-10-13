class Locker {
    private final int number;
    private String code;
    Locker(int n, String c) {
        number = n;
        code = c;
    }
    public boolean changeCode(String current, String replacement) {
        if (code.equals(current) && replacement != null && !replacement.isEmpty()) {
            code = replacement;
            return true;
        }
        return false;
    }
    public int getLockerNumber() {
        return number;
    }
}
public class Main {
    public static void main(String[]x) {
        Locker l = new Locker(101, "1234");
        System.out.println("Correct code accepted: " + l.changeCode("1234", "5678"));
        System.out.println("Wrong code accepted: " + l.changeCode("0000", "9999"));
    }
}
