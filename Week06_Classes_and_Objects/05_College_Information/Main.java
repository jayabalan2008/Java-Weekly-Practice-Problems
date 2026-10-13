class Student {
    String name;
    int attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;
    Student(String n, int a) {
        name = n;
        attendance = a;
        studentCount ++;
    }
    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}
public class Main {
    public static void main(String[]x) {
        new Student("Asha", 90);
        new Student("Ravi", 85);
        Student.printCollegeInfo();
    }
}
