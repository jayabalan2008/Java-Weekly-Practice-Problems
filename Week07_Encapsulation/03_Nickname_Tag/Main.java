class NameTag {
    private final String first, lastInitial;
    NameTag(String fullName) {
        String[] p = fullName.split(" ");
        if (p.length!=2) {
            throw new IllegalArgumentException("Expected first and last name");
        }
        first = p[0];
        lastInitial = p[1].substring(0, 1);
    }
    public String getNickname() {
        return first + " " + lastInitial + ".";
    }
}
public class Main {
    public static void main(String[]x) {
        System.out.println(new NameTag("Maria Gomez").getNickname());
    }
}
