package javadp.strings;

public class ValidRotationCheck {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);

    }
}
