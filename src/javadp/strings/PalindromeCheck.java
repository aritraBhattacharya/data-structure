package javadp.strings;

public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        String s1 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int range = s1.length() / 2;
        int iLength = s1.length() - 1;
        for (int i = 0; i < range; i++) {
            if (s1.charAt(i) != s1.charAt(iLength - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        PalindromeCheck.isPalindrome("A man, a plan, a canal: Panama");
    }
}
