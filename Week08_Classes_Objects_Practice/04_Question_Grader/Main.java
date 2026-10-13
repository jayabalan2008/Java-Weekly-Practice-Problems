import java.util. *;
abstract class ExamQuestion {
    double points;
    ExamQuestion(double p) {
        points = p;
    }
    abstract double grade(String correct, String answer);
}
class ExactQuestion extends ExamQuestion {
    ExactQuestion(double p) {
        super(p);
    }
    double grade(String c, String a) {
        return c.equals(a)?points:0;
    }
}
class EssayQuestion extends ExamQuestion {
    EssayQuestion(double p) {
        super(p);
    }
    double grade(String c, String a) {
        int hits = 0;
        for (String k:c.split(","))if (a.toLowerCase().contains(k.trim().toLowerCase()))hits ++;
        return hits >= 2?points * .75:hits == 1?points * .5:0;
    }
}
public class Main {
    static String[] quoted(String line) {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\\"([^\\\"]*)\\\"").matcher(line);
        String[] a = new String[3];
        for (int i = 0; i < 3; i ++) {
            if (!m.find())throw new IllegalArgumentException("Expected quoted fields");
            a[i] = m.group(1);
        }
        return a;
    }
    public static void main(String[]z) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i ++) {
            String line = s.nextLine().trim();
            String type = line.substring(0, line.indexOf(' '));
            String[] q = quoted(line);
            String rest = line.substring(line.lastIndexOf('"') + 1).trim();
            double pts = Double.parseDouble(rest);
            ExamQuestion x = type.equals("ESSAY")?new EssayQuestion(pts):new ExactQuestion(pts);
            double score = x.grade(q[1], q[2]);
            total +=score;
            System.out.printf("%s: %.2f%n", type, score);
        }
        System.out.printf("Total Score: %.2f%n", total);
    }
}
