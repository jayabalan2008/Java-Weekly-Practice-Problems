import java.util. *;
class Student {
    String name;
    int[] marks;
    Student(String n, int[]m) {
        name = n;
        marks = m;
    }
    double average() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }
    char grade() {
        double a = average();
        return a >= 75?'B':a >= 60?'C':a >= 40?'D':'F';
    }
    void print() {
        System.out.printf("%s: Average %.1f, Grade %c%n", name.toUpperCase(), average(), grade());
    }
}
public class Main {
    public static void main(String[]x) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        Student st = new Student(n, new int[] {
            s.nextInt(), s.nextInt(), s.nextInt()
        });
        st.print();
    }
}
