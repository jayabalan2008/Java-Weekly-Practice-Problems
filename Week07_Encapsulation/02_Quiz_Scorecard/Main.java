class Scorecard {
    private final boolean[] answers;
    private int recorded = 0;
    Scorecard(int count) {
        if (count<0) {
            throw new IllegalArgumentException();
        }
        answers = new boolean[count];
    }
    public boolean recordAnswer(boolean correct) {
        if (recorded==answers.length) {
            return false;
        }
        answers[recorded ++] = correct;
        return true;
    }
    public int getScore() {
        int n = 0;
        for (int i = 0; i < recorded; i ++)if (answers[i])n ++;
        return n;
    }
}
public class Main {
    public static void main(String[]x) {
        Scorecard s = new Scorecard(4);
        s.recordAnswer(true);
        s.recordAnswer(true);
        s.recordAnswer(false);
        s.recordAnswer(true);
        System.out.println("Score: " + s.getScore());
    }
}
