class AttendanceSheet {
    private final String[] names;
    private int count;
    AttendanceSheet(int capacity) {
        names = new String[capacity];
    }
    public boolean markPresent(String name) {
        if (isPresent(name))return true;
        if (count==names.length) {
            return false;
        }
        names[count ++] = name;
        return true;
    }
    public int getPresentCount() {
        return count;
    }
    public boolean isPresent(String name) {
        for (int i = 0; i < count; i ++)if (names[i].equals(name))return true;
        return false;
    }
}
public class Main {
    public static void main(String[]x) {
        AttendanceSheet s = new AttendanceSheet(30);
        s.markPresent("Ana");
        s.markPresent("Ben");
        s.markPresent("Ana");
        System.out.println("Present count: " + s.getPresentCount());
        System.out.println("Ben present: " + s.isPresent("Ben"));
        System.out.println("Chen present: " + s.isPresent("Chen"));
    }
}
