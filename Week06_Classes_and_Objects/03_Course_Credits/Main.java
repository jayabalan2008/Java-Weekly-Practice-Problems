class Course {
    String code, title;
    int credits, labCredits;
    public Course(String c, String t, int cr, int lab) {
        code = c;
        title = t;
        credits = cr;
        labCredits = lab;
    }
    public Course(String c, String t, int cr) {
        this(c, t, cr, 0);
    }
    int totalCredits() {
        return credits + labCredits;
    }
}
public class Main {
    public static void main(String[]x) {
        Course a = new Course("21CSC201J", "Data Structures", 4), b = new Course("21CSC205L", "DSA Lab", 3, 1);
        System.out.println(a.code + " total credits: " + a.totalCredits());
        System.out.println(b.code + " total credits: " + b.totalCredits());
    }
}
